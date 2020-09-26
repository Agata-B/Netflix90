package pl.yellowduck.netflix90.films;


import java.util.ArrayList;
import java.util.List;

public class VideoCassetteCatalog implements IVideoCassetteCatalog {


    private final List<VideoCassette> cassettes = new ArrayList<>();

    @Override
    public void add(VideoCassette videoCassette) {
        cassettes.add(videoCassette);
    }

    @Override
    public void addAll(VideoCassette... videoCassette) {
        for (VideoCassette cassette : videoCassette) {
            add(cassette); // reuzycie metody addVideoCassette
        }
    }

    @Override
    public List<VideoCassette> getAll() {
        return cassettes;
    }
}
