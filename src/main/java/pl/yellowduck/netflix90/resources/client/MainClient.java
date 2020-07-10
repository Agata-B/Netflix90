package pl.yellowduck.netflix90.resources.client;

import pl.yellowduck.netflix90.resources.Gender;

public class MainClient {
    public static void main(String[] args) {
        ClientAddress clientAddress = new ClientAddress("Kolorowa", "5A", "2", "Płock", "00-000");
        Client client = new Client("Ola", "Boś", Gender.FEMALE, clientAddress, ClientStatus.VIP);
        client.printOutClient();
    }
}
