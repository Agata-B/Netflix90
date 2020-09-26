package pl.yellowduck.netflix90.resources;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import pl.yellowduck.netflix90.common.Gender;
import pl.yellowduck.netflix90.films.*;

import java.math.BigDecimal;
import java.util.Set;

public class UniqueVideoCassetteCatalogTest {

    @Test
    public void shouldNotAddSameIdVideoCassette() throws CatalogAddExepction {
        //given
        VideoCassette videoCassette = new VideoCassette("V001", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau", Gender.MALE), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));

        VideoCassette videoCassette2 = new VideoCassette("V001", BigDecimal.valueOf(20), "The room",
                new Director("Tommy", "Wiseau", Gender.MALE), Category.DRAMA,
                Set.of(new Actor("Tomy", "Wiseau", Gender.MALE)));
        IVideoCassetteCatalog catalog = new UniqueVideoCassetteCatalog();    //korzystamy tu z interfejsu ponieważ na jeden sposob chcemy obsluzyc jeden katalog
        //when
        catalog.addVideoCassetteAll(videoCassette, videoCassette2);
        //then
        Assertions.assertThat(catalog.getVideoCassettes()).hasSize(1);
    }
}