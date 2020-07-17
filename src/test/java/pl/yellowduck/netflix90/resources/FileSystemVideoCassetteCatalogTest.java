package pl.yellowduck.netflix90.resources;

import java.math.BigDecimal;
import java.util.Set;

import static org.junit.Assert.*;

public class FileSystemVideoCassetteCatalogTest {


    public static void main(String[] args) {

        FileSystemVideoCassetteCatalog catalog = new FileSystemVideoCassetteCatalog();
        System.out.println("Katalog: "+ catalog.getVideoCassettes());
        VideoCassette videoCassette1 = new VideoCassette(
                "V001",
                BigDecimal.valueOf(20),
                "The room",
                new Director("Tommy", "Wiseau", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", Gender.MALE)));

        VideoCassette videoCassette2 = new VideoCassette(
                "V002",
                BigDecimal.valueOf(20),
                "The room",
                new Director("Tommy", "Wiseau", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", Gender.MALE)));

        try {
            catalog.addVideoCassetteAll(videoCassette1, videoCassette2);
            System.out.println(catalog.getVideoCassettes());
        } catch (CassetteAddExepction e) {
            e.printStackTrace();
        }
    }
}
