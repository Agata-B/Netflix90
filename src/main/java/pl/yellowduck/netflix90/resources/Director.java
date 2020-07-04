package pl.yellowduck.netflix90.resources;

public class Director extends Person {

    public Director(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void introduce(){
        System.out.println("My name is " + firstName + " " + lastName + ". I am director.");
    }
}
