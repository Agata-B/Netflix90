package pl.yellowduck.netflix90.resources;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Set;


public class VideoCassetteCatalogTest {

    //test sprawdza czy utworzony katalog jest wyjsciowo pusty
    @Test
    public void shouldCreateCatalogThatIsEmpty(){
        //when
        IVideoCassetteCatalog catalog = new VideoCassetteCatalog();
        //then
        Assertions.assertThat(catalog.getVideoCassettes()).isEmpty();
    }

    @Test
    public void shouldAddVideoCassetteToCatalog() {
        //given
        IVideoCassetteCatalog catalog = new VideoCassetteCatalog();
        VideoCassette videoCassette = new VideoCassette("V001", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau"), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));
        //when
        catalog.addVideoCassette(videoCassette);
        //then
        Assertions.assertThat(catalog.getVideoCassettes()).hasSize(1);       // assertion -> if(result == expected){throw new TestExepction}
    }

    @Test
    public void shouldAdd2CassettesToCatalogThaTWillReturn2Cassettes(){
       //given
        IVideoCassetteCatalog catalog = new VideoCassetteCatalog();
        VideoCassette videoCassette = new VideoCassette("V001", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau"), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));

        VideoCassette videoCassette2 = new VideoCassette("V002", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau"), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));
        //when
        catalog.addVideoCassette(videoCassette);
        catalog.addVideoCassette(videoCassette2);
        //then
        Assertions.assertThat(catalog.getVideoCassettes()).hasSize(2);
    }
}
