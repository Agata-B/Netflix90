package pl.yellowduck.netflix90.resources.client;

import pl.yellowduck.netflix90.resources.CassetteAddExepction;
import pl.yellowduck.netflix90.resources.VideoCassette;

import java.util.List;

public interface IClientCatalog {

    void addClient(Client client) throws ClientAddException;
    void addClientAll(Client... clients) throws ClientAddException;

    List<Client> getClient();
}
