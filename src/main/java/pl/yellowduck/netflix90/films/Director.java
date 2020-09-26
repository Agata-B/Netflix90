package pl.yellowduck.netflix90.films;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import pl.yellowduck.netflix90.common.Gender;
import pl.yellowduck.netflix90.common.Person;

@Getter
public class Director extends Person {

    /* public Director(String firstName, String lastName, Gender gender) {
         super(firstName, lastName, gender);
     }
 */
    @JsonCreator
    public Director(@JsonProperty("firstName") String firstName,
                    @JsonProperty("lastName") String lastName,
                    @JsonProperty("gender") Gender gender) {
        super(firstName, lastName, gender);
    }

    @Override
    public void introduce() {
  /*      System.out.println("My name is " + firstName + " " + lastName + ". I am director.");
    }

    /*
    przeniesiona do person zeby nie powtarzac
    @Override
    public String toString() {
        return firstName + " " + lastName;
        }

    */
    }
}