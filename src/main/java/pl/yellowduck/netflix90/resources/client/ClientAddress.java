package pl.yellowduck.netflix90.resources.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientAddress {

    private String street;
    private int homeNo;
    private int flatNo;
    private String city;
    private String postalCode;

    public ClientAddress(String street, int homeNo, int flatNo, String city, String postalCode) {
        this.street = street;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String toString() {
        return "Ulica: " + street + ", nr domu: " + homeNo + ", nr piętra: " +
                flatNo + ", misto: " + city + " " + postalCode;
    }
}
