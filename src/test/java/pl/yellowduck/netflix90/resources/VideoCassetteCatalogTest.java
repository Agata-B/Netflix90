package pl.yellowduck.netflix90.resources;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import pl.yellowduck.netflix90.common.Gender;
import pl.yellowduck.netflix90.films.*;

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
    public void shouldAddVideoCassetteToCatalog() throws CassetteAddExepction {
        //given
        IVideoCassetteCatalog catalog = new VideoCassetteCatalog();
        VideoCassette videoCassette = new VideoCassette("V001", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau", Gender.MALE), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));
        //when
        catalog.addVideoCassette(videoCassette);
        //then
        Assertions.assertThat(catalog.getVideoCassettes()).hasSize(1);       // assertion -> if(result == expected){throw new TestExepction}
    }

    @Test
    public void shouldAdd2CassettesToCatalogThaTWillReturn2Cassettes() throws CassetteAddExepction {
       //given
        IVideoCassetteCatalog catalog = new VideoCassetteCatalog();
        VideoCassette videoCassette = new VideoCassette("V001", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau", Gender.MALE), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));

        VideoCassette videoCassette2 = new VideoCassette("V002", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau", Gender.MALE), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));
        //when
        catalog.addVideoCassetteAll(videoCassette, videoCassette2);
        //then
        Assertions.assertThat(catalog.getVideoCassettes()).hasSize(2);
    }
}
