package pl.yellowduck.netflix90.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClientAddress {

    private String street;
    private String homeNo;
    private String flatNo;
    private String city;
    private String postalCode;


    public String toString() {
        return "Ulica: " + street + ", nr domu: " + homeNo + ", nr piętra: " +
                flatNo + ", misto: " + city + " " + postalCode;
    }
}
