package pl.yellowduck.netflix90.resources;

import java.math.BigDecimal;
import java.util.Set;

public class VideoCassete {

    private String id;
    private BigDecimal price;       //najlepszy do stosowania w projektach do obliczeń, najbardziej precyzyjny
    private String title;
    private Director director;
    private Category category;      //obiekt stworzony z Enum
    private Set<Actor> actor;

    public VideoCassete(String id, BigDecimal price, String title, Director director, Category category, Set<Actor> actor) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.director = director;
        this.category = category;
        this.actor = actor;
    }


}
