package pl.yellowduck.netflix90.films;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import pl.yellowduck.netflix90.common.Gender;
import pl.yellowduck.netflix90.common.Person;


public class Actor extends Person {

   /* public Actor(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    /*
     przeniesione do person zeby nie powtarzac
     @Override

     public String toString() {                   //przysłonięcie metody zeby dobrze się wyświetlał
         return firstName + " " + lastName;
     }
 */

    @JsonCreator
    public Actor(@JsonProperty("firstName") String firstName,
                 @JsonProperty("lastName") String lastName,
                 @JsonProperty("gender") Gender gender) {
        super(firstName, lastName, gender);
    }


    @Override
    public void introduce() {
     /*   if (gender.equals(Gender.MALE)) {   //mozemy == zamiast equals mimo ze to obiekt, ponieważ porównujemy adresy tego samego obiektu
            System.out.println("My name is " + firstName + " " + lastName + ". I am actor.");
        } else {
            System.out.println("My name is " + firstName + " " + lastName + ". I am actress.");
        }

        /*like this
        switch (this.gender) {
            case MALE:
                System.out.println("My name is " + firstName + " " + lastName + ". I am actor.");
                break;
            case FEMALE:
                System.out.println("My name is " + firstName + " " + lastName + ". I am actress.");
                break;
        }

         */


}
}