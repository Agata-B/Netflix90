package pl.yellowduck.netflix90.resources.client;

import pl.yellowduck.netflix90.resources.Person;

public class Client extends Person {
    private String Id;
    private ClientAddress clientAddress;
    private ClientStatus clientStatus;


    public Client(String id, String firstName, String lastName, ClientAddress clientAddress, ClientStatus clientStatus) {
        super(firstName, lastName);
        this.Id = id;
        this.clientAddress = clientAddress;
        this.clientStatus = clientStatus;
    }


    public void printOutClient() {
        StringBuilder builder = new StringBuilder();
        builder.append("DANE KLIENTA ").append(" imię: ").append(firstName)
                .append(" nazwisko: ").append(lastName)
                .append(" adres: ").append(clientAddress)
                .append(" status klienta: ").append(clientStatus);
        System.out.println(builder.toString());
    }


    @Override
    public void introduce() {
    }


    public void changeAddress(String street,
             String homeNo,
             String flatNo,
             String city,
             String postalCode){
        clientAddress.setStreet(street);
        clientAddress.setHomeNo(homeNo);
        clientAddress.setFlatNo(flatNo);
        clientAddress.setCity(city);
        clientAddress.setPostalCode(postalCode);
    }
}
