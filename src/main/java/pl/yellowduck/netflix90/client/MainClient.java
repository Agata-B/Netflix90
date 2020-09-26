package pl.yellowduck.netflix90.client;

public class MainClient {
    public static void main(String[] args) {
        ClientAddress clientAddress = new ClientAddress("Kolorowa", "5A", "2", "Płock", "00-000");
        Client client = new Client("001a", "Ola", "Boś", clientAddress, ClientStatus.VIP);
      //  System.out.println(client);
        client.changeAddress("Biała", "41A", "2", "Gniezno", "11-222");
     //   System.out.println(client);

        ClientAddress clientAddress1 = new ClientAddress("Kolorowa", "2", "2", "Płock", "00-000");
        Client client1 = new Client("002a", "Ala", "Kos", clientAddress1, ClientStatus.VIP);
        Client client2 = new Client("003a", "Ala", "Kos", clientAddress1, ClientStatus.VIP);


     //   IClientCatalog catalog = new ClientCatalog();

        FileSystemClientCatalog catalog = new FileSystemClientCatalog();
        try {
            catalog.addClientAll(new Client[]{client, client1});
        } catch (ClientAddException e) {
            e.printStackTrace();
        }



        System.out.println(catalog);
    }
}
