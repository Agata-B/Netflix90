package pl.yellowduck.netflix90.resources.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import pl.yellowduck.netflix90.resources.Actor;
import pl.yellowduck.netflix90.resources.Category;
import pl.yellowduck.netflix90.resources.Director;
import pl.yellowduck.netflix90.resources.Person;

import java.math.BigDecimal;
import java.util.Set;
@Getter
public class Client extends Person {
    private String Id;
    private ClientAddress clientAddress;
    private ClientStatus clientStatus;


 /*   public Client(String id, String firstName, String lastName, ClientAddress clientAddress, ClientStatus clientStatus) {
        super(firstName, lastName);
        this.Id = id;
        this.clientAddress = clientAddress;
        this.clientStatus = clientStatus;
    }


   /* public void printOutClient() {
        StringBuilder builder = new StringBuilder();
        builder.append("DANE KLIENTA ").append(" imię: ").append(firstName)
                .append(" nazwisko: ").append(lastName)
                .append(" adres: ").append(clientAddress)
                .append(" status klienta: ").append(clientStatus);
        System.out.println(builder.toString());
    }*/

    @Override
    public String toString() {
        return "DANE KLIENTA {" +
                " Id: " + Id +
                ", imię: " + firstName +
                ", nazwisko: " + lastName +
                ", Adres klienta: " + clientAddress +
                ", status klienta: " + clientStatus +
                '}';
    }

    @Override
    public void introduce() {
    }

    public void changeAddress(String street,
                              String homeNo,
                              String flatNo,
                              String city,
                              String postalCode) {
        clientAddress.setStreet(street);
        clientAddress.setHomeNo(homeNo);
        clientAddress.setFlatNo(flatNo);
        clientAddress.setCity(city);
        clientAddress.setPostalCode(postalCode);
    }

    @JsonCreator
    public Client(@JsonProperty("Id") String Id,
                  @JsonProperty("imię") String firstName,
                  @JsonProperty("nazwisko") String lastName,
                  @JsonProperty("adres klienta") ClientAddress clientAddress,
                  @JsonProperty("status klienta") ClientStatus clientStatus) {
        super(firstName, lastName);
        this.Id = Id;
        this.clientAddress = clientAddress;
        this.clientStatus = clientStatus;

    }

}
