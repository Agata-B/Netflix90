package pl.yellowduck.netflix90.resources;

public class Actor extends Person {

    public Actor(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    /*
     przeniesione do person zeby nie powtarzac
     @Override

     public String toString() {                   //przysłonięcie metody zeby dobrze się wyświetlał
         return firstName + " " + lastName;
     }
 */
    @Override
    public void introduce() {
        if (gender.equals(Gender.MALE)) {   //mozemy == zamiast equals mimo ze to obiekt, ponieważ porównujemy adresy tego samego obiektu
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