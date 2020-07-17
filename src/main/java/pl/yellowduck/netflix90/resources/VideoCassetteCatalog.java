package pl.yellowduck.netflix90.resources;


/*
*Katalog dodaje i zwraca listę dostępnych video kaset
* @author przemek
 *
 */

import java.util.ArrayList;
import java.util.List;

public class VideoCassetteCatalog implements IVideoCassetteCatalog {

    private final List<VideoCassette> cassettes = new ArrayList<>();

    public void addVideoCassette(VideoCassette videoCassette) {
        cassettes.add(videoCassette);
    }

    @Override
    public void addVideoCassetteAll(VideoCassette... videoCassette) {
        for (VideoCassette cassette :videoCassette) {
            addVideoCassette(cassette);
        }
    }

    public List<VideoCassette> getVideoCassettes() {
        return cassettes;
    }

    //mamy dodać kasete i zwrócić ja jako kolekcje






}
