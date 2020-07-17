package pl.yellowduck.netflix90.resources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

@Getter
public class VideoCassette {

    private String id;
    private BigDecimal price;       //najlepszy do stosowania w projektach do obliczeń, najbardziej precyzyjny
    private String title;
    private Director director;
    private Category category;      //obiekt stworzony z Enum
    private Set<Actor> actor;

    /*  public VideoCassette(String id, BigDecimal price, String title, Director director, Category category, Set<Actor> actor) {
          this.id = id;
          this.price = price;
          this.title = title;
          this.director = director;
          this.category = category;
          this.actor = actor;
      }

*/
      public void printOut() {
          StringBuilder builder = new StringBuilder();
          builder.append(" | ").append(this.id).append(" | ")
                  .append(this.title).append(" | ")
                  .append(category).append(" | ")
                  .append(price).append(" | ")
                  .append(director.toString()).append(" | ")
                  .append(actor.toString()).append(" |");
          System.out.println(builder.toString());

      }

    @Override
    public String toString() {
        return "VideoCassette{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", director=" + director +
                ", category=" + category +
                ", actor=" + actor +
                '}';
    }

    @Override
      public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          VideoCassette cassette = (VideoCassette) o;
          return Objects.equals(id, cassette.id);
      }

      @Override
      public int hashCode() {
          return Objects.hash(id);
      }

    @JsonCreator
    public VideoCassette(@JsonProperty("id") String id,
                         @JsonProperty("price") BigDecimal price,
                         @JsonProperty("title") String title,
                         @JsonProperty("director") Director director,
                         @JsonProperty("category") Category category,
                         @JsonProperty("actors") Set<Actor> actor) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.director = director;
        this.category = category;
        this.actor = actor;
    }


}
