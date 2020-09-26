package pl.yellowduck.netflix90.films;


import com.fasterxml.jackson.databind.ObjectMapper;
import pl.yellowduck.netflix90.resources.CatalogAddExepction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileSystemVideoCassetteCatalog extends UniqueVideoCassetteCatalog {

    private final Path file = Paths.get("Cassetts.txt");
    private final ObjectMapper objectMapper = new ObjectMapper();

    //nie uzywac throws w konstruktorach  zamieniemy dziedziczenie w wyjatku z Exeption na RuntimeExepction
    public FileSystemVideoCassetteCatalog() {
        try {
            //tworzymy plik jesli nie istnieje
            if (!Files.exists(file)) {
                Files.createFile(file);
            }
        } catch (IOException e) {
            throw new CassetteReadException("Cannot create file");
        }
        try (BufferedReader bufferedReader = Files.newBufferedReader(file)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                VideoCassette videoCassette = objectMapper.readValue(line, VideoCassette.class);
                super.addVideoCassette(videoCassette);
            }
        } catch (IOException | CatalogAddExepction e) {
            System.out.println(e.getMessage());
            throw new CassetteReadException("Cannot read file");
        }
    }

    @Override
    public void addVideoCassette(VideoCassette videoCassette) throws CatalogAddExepction {
        super.addVideoCassette(videoCassette);
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            String string = objectMapper.writeValueAsString(videoCassette);                      // transformacja (serilizacja) do stringa (JSON format) obiektu
            bufferedWriter.write(string);
        } catch (FileNotFoundException e) {
            throw new CatalogAddExepction(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new CatalogAddExepction(e.getMessage());
        }

    }

    @Override
    public void addVideoCassetteAll(VideoCassette... videoCassette) throws CatalogAddExepction {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            for (VideoCassette cassette : videoCassette) {
                super.addVideoCassette(cassette);
                String string = objectMapper.writeValueAsString(cassette);
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new CatalogAddExepction(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new CatalogAddExepction(e.getMessage());
        }
    }
}
