package pl.yellowduck.netflix90.resources;

import java.util.List;

public interface IVideoCassetteCatalog {                     //mozna to zrobic przez extract interface

    void addVideoCassette(VideoCassette videoCassette);

    List<VideoCassette> getVideoCassettes();
}
