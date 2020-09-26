package pl.yellowduck.netflix90.films;

import pl.yellowduck.netflix90.resources.CatalogAddExepction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueVideoCassetteCatalog implements IVideoCassetteCatalog {

    private final Set<VideoCassette> cassettes = new HashSet<>();

    @Override
    public void add(VideoCassette videoCassette) throws CatalogAddExepction {
        if(!cassettes.add(videoCassette)) {
            throw new CatalogAddExepction("Cassette already added");
        }
    }

    @Override
    public void addAll(VideoCassette... videoCassette) throws CatalogAddExepction {
        for (VideoCassette cassette : videoCassette) {
            add(cassette);
        }
    }

    @Override
    public List<VideoCassette> getAll() {
        return new ArrayList<>(cassettes);
    }
}