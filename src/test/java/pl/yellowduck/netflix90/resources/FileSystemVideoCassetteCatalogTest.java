package pl.yellowduck.netflix90.resources;

import pl.yellowduck.netflix90.common.Gender;
import pl.yellowduck.netflix90.films.*;

import java.math.BigDecimal;
import java.util.Set;

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
        } catch (CatalogAddExepction e) {
            e.printStackTrace();
        }
    }
}
