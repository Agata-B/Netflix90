package pl.yellowduck.netflix90.resources.client;


import pl.yellowduck.netflix90.resources.Gender;

public class Client {
    private String firstName;
    private String lastName;
    private final Gender gender;
    ClientAddress clientAddress;
    ClientStatus clientStatus;

    public Client(String firstName, String lastName, Gender gender, ClientAddress clientAddress, ClientStatus clientStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.clientAddress = clientAddress;
        this.clientStatus = clientStatus;
    }


    public void printOutClient() {
        StringBuilder builder = new StringBuilder();
        builder.append("DANE KLIENTA ").append(" imię: ").append(firstName)
                .append(" nzawisko: ").append(lastName)
                .append(" płeć: ").append(gender)
                .append(" adres: ").append(clientAddress)
                .append(" status klienta: ").append(clientStatus);
        System.out.println(builder.toString());

    }
}
