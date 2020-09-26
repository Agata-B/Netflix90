package pl.yellowduck.netflix90.films;

import pl.yellowduck.netflix90.resources.CatalogAddExepction;

import java.util.List;

public interface IVideoCassetteCatalog {                     //mozna to zrobic przez extract interface

    void add(VideoCassette videoCassette) throws CatalogAddExepction;

    void addAll(VideoCassette... videoCassette) throws CatalogAddExepction;

    List<VideoCassette> getAll();
}