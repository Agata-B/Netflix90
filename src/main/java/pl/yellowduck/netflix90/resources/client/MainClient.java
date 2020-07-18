package pl.yellowduck.netflix90.resources.client;

public class MainClient {
    public static void main(String[] args) {
        ClientAddress clientAddress = new ClientAddress("Kolorowa", "5A", "2", "Płock", "00-000");
        Client client = new Client("001a", "Ola", "Boś", clientAddress, ClientStatus.VIP);
        client.printOutClient();
        client.changeAddress("Biała", "41A", "2", "Gniezno", "11-222");
        client.printOutClient();

    }
}
