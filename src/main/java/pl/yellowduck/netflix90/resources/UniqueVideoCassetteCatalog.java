package pl.yellowduck.netflix90.resources;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueVideoCassetteCatalog implements IVideoCassetteCatalog {

    private final Set<VideoCassette> cassettes = new HashSet<>();

    @Override
    public void addVideoCassette(VideoCassette videoCassette) throws CassetteAddExepction {
        if (!cassettes.add(videoCassette)) {
            throw new CassetteAddExepction("Cassette already add.");
        }
    }

    @Override
    public void addVideoCassetteAll(VideoCassette... videoCassette) throws CassetteAddExepction {
        for (VideoCassette cassette : videoCassette) {
            addVideoCassette(cassette);
        }
    }

    @Override
    public List<VideoCassette> getVideoCassettes() {
        return new ArrayList<>(cassettes);       //konwersja set na liste !!!
    }
}
