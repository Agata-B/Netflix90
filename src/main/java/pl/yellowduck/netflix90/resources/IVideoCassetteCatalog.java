package pl.yellowduck.netflix90.resources;

import java.util.List;

public interface IVideoCassetteCatalog {                     //mozna to zrobic przez extract interface

    void addVideoCassette(VideoCassette videoCassette) throws CassetteAddExepction;
    void addVideoCassetteAll(VideoCassette... videoCassette) throws CassetteAddExepction;

    List<VideoCassette> getVideoCassettes();
}
