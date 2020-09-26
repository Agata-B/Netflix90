package pl.yellowduck.netflix90.client;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileSystemClientCatalog extends ClientCatalog {

    private final Path file = Paths.get("Clients.txt");
    private final ObjectMapper objectMapper = new ObjectMapper();

    public FileSystemClientCatalog() {
        try {
            //tworzymy plik jesli nie istnieje
            if (!Files.exists(file)) {
                Files.createFile(file);
            }
        } catch (IOException e) {
            throw new ClientReadException("Cannot create file");
        }
        try (BufferedReader bufferedReader = Files.newBufferedReader(file)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Client client = objectMapper.readValue(line, Client.class);
                super.addClient(client);
            }
        } catch (IOException | ClientAddException e) {
            System.out.println(e.getMessage());
            throw new ClientReadException("Cannot read file");
        }
    }


    @Override
    public void addClient(Client client) throws ClientAddException {
        super.addClient(client);
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            String string = objectMapper.writeValueAsString(client);
            bufferedWriter.write(string);
        } catch (FileNotFoundException e) {
            throw new ClientAddException(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new ClientAddException(e.getMessage());
        }

    }

    @Override
    public void addClientAll(Client... clients) throws ClientAddException {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            for (Client client : clients) {
                super.addClientAll(client);
                String string = objectMapper.writeValueAsString(client);
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new ClientAddException(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new ClientAddException(e.getMessage());
        }
    }
}
