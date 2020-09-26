package pl.yellowduck.netflix90.resources;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import pl.yellowduck.netflix90.common.Gender;
import pl.yellowduck.netflix90.films.*;

import java.math.BigDecimal;
import java.util.Set;

public class VideoCassetteTest {
    @Test
    public void shouldVideoCassettesIsEqual() {
        //given
        IVideoCassetteCatalog catalog = new VideoCassetteCatalog();
        VideoCassette videoCassette = new VideoCassette("V001", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau", Gender.MALE), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));

        VideoCassette videoCassette2 = new VideoCassette("V001", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau", Gender.MALE), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));
        //when
        boolean result = videoCassette.equals(videoCassette2);

        //then
        Assertions.assertThat(result).isTrue();
        Assertions.assertThat(videoCassette.hashCode()).isEqualTo(videoCassette2.hashCode());      //zeby test przeszedl w VideoCassette trzeba bylo wygenerowac hasheCode to equals
    }


    @Test
    public void shouldVideoCassettesIsNotEqual() {
        //given
        IVideoCassetteCatalog catalog = new VideoCassetteCatalog();
        VideoCassette videoCassette = new VideoCassette("V001", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau",Gender.MALE), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));

        VideoCassette videoCassette2 = new VideoCassette("V002", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau", Gender.MALE), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));
        //when
        boolean result = videoCassette.equals(videoCassette2);

        //then
        Assertions.assertThat(result).isFalse();
        Assertions.assertThat(videoCassette.hashCode()).isEqualTo(videoCassette2.hashCode());
    }
}
