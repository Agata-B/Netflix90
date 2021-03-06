package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.films.Actor;
import pl.yellowduck.netflix90.films.Director;
import pl.yellowduck.netflix90.common.Gender;
import pl.yellowduck.netflix90.common.Person;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Netflix90");

        Director tommy = new Director("Tommy", "Wiseau", Gender.MALE);
        Actor tommyActor = new Actor("Tommy", "Wiseau", Gender.MALE);
        Actor juliette = new Actor("Juliette", "Danielle", Gender.FEMALE);
        Actor greg = new Actor("Greg", "Sestero", Gender.FEMALE);

        Set<Person> persons = new HashSet<>();
        persons.add(tommy);
        persons.add(tommyActor);
        persons.add(juliette);
        persons.add(greg);

        for (Person person : persons) {
            person.introduce();
        }
    /*
      List<Person> persons = new ArrayList<>();
        persons.add(tommy);
        persons.add(tommyActor);
        persons.add(juliette);
        persons.add(greg);

        for (int i = 0; i < persons.size() - 1; i++) {
            Person person = persons.get(i);
            person.introduce();
        }
     */
    }

}
