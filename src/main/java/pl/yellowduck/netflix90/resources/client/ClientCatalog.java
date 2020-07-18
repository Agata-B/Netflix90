package pl.yellowduck.netflix90.resources.client;


/*
 *Katalog dodaje i zwraca listę dostępnych video kaset
 * @author przemek
 *
 */

import pl.yellowduck.netflix90.resources.CassetteAddExepction;
import pl.yellowduck.netflix90.resources.VideoCassette;

import java.util.ArrayList;
import java.util.List;

public class ClientCatalog implements IClientCatalog {

    private final List<Client> clients = new ArrayList<>();

    @Override
    public void addClient(Client client) throws ClientAddException {
        if (!clients.add(client)) {
            throw new ClientAddException("Client already add.");
        }
    }

    @Override
    public void addClientAll(Client... clients) throws ClientAddException {
        for (Client client : clients
        ) {
            addClient(client);
        }
    }


    @Override
    public List<Client> getClient() {
        return clients;
    }


    @Override
    public String toString() {
        return "ClientCatalog{" +
                "clients=" + clients +
                '}';
    }
}
