
package pl.yellowduck.netflix90.films;

import pl.yellowduck.netflix90.resources.AbstractFileSystemCatalog;

public class ConcreteFileSystemVideoCatalog extends AbstractFileSystemCatalog<VideoCassette>
        implements IVideoCassetteCatalog {

    public ConcreteFileSystemVideoCatalog() {
        super("cassetts.txt", VideoCassette.class);
    }
}