package pl.yellowduck.netflix90.common;

import lombok.Getter;
import pl.yellowduck.netflix90.common.Gender;

@Getter
public abstract class Person {

    protected String firstName;     //gdy pola były pivate nie można było wykorzystać ani w aktorze ani w reżyserze wiec trzeba było zmienić dostęp
    protected String lastName;
    protected Gender gender;

    //polimorfizm, nasze obiekty pozwalają wywołać metodę ze wskazanej instancji    (metode abstrakcyjna trzeba przesłonić)


    public Person(String firstName, String lastName) {      //najpierw tworzymy konstruktor w kalsie z której jest dziedziczone, pózniej w tych które z niej dziedziczą
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public abstract void introduce();   //jeśli jest chociaż jedna metoda abstrakcyjna to klasa też musi być abstrakcyjna

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
