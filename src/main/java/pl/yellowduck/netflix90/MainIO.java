package pl.yellowduck.netflix90;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class MainIO {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/Lenovo");
        if (file.exists()) {
            for (File listFile : file.listFiles()) {
                System.out.println(listFile.getName());
            }
        } else {
            throw new FileNotFoundException("Nie istnieje taki plik / katalog");
        }

        System.out.println();


        Path path = Paths.get("/Users/Lenovo/test.txt");    // jak chcemy wypisac jakis tekst to umiescic go w liscie i wypisac go za pomoac for each wypisujac po koleji przechodzac przez liste
        try {                                                                  //metoda do czytania pliku, ale nie czyta partiami i pojawia się problem gdy plik jest bardzo duzy
            final List<String> strings = Files.readAllLines(path);
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            System.out.println("Plik nie istnieje");
        }


       // Path path = Paths.get("/Users/Lenovo/test.txt");        //obecna metoda do czytania plikow
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {          //zapisanie do pliku
            bufferedWriter.write("Ala ma kota");
        } catch (IOException e) {
            e.printStackTrace();
        }


        Files.lines(path).filter(p -> p.contains("d"))                    //wczytuje linia po lini ale filtrujemy ze chcemy tylko tekst z interesujaca nas zawartoscia
                .forEach(System.out::println);
        //forEach(p->System.out.println(p) to samo co linijka wyżej


        List<String> strings = Files.readAllLines(path);          //rozpisany strumien z linijki wyzej files. ...
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("d")) {
                System.out.println(strings.get(i));
            }
        }


        /*try {                                                   //stary sposob czytanie plikow
            bufferedReader = Files.newBufferedReader(path1);

        } catch (IOException e) {
            System.out.println("Plik nie istnieje");
        } finally {
            try {                                      //stary sposob na wyjatek w bloku finally prz zastosowaniu close
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


    }
}
