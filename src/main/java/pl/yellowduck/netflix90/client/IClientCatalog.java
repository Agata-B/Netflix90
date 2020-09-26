package pl.yellowduck.netflix90.client;

import java.util.List;

public interface IClientCatalog {

    void addClient(Client client) throws ClientAddException;
    void addClientAll(Client... clients) throws ClientAddException;

    List<Client> getClient();
}
