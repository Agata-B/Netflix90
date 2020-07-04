package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.resources.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static pl.yellowduck.netflix90.resources.Gender.MALE; //po tym imporcie statycznym nie musimy prefiksowac obiektu Gender.MALE

public class Main2 {


    public static void main(String[] args) {
        System.out.println("Hello Netflix90");

        Director tommy = new Director("Tommy", "Wiseau");
        Actor tommyActor = new Actor("Tommy", "Wiseau", MALE);
        Actor juliette = new Actor("Juliette", "Danielle", Gender.FEMALE);
        Actor greg = new Actor("Greg", "Sestero", MALE);

        Set<Actor> actors = new HashSet<>();
        actors.add(tommyActor);
        actors.add(juliette);
        actors.add(greg);

        VideoCassete theRoom = new VideoCassete("VID001", BigDecimal.valueOf(20), "The Room", tommy, Category.DRAMA, actors);

        theRoom.printOut();

        //todo zaimplementowac  klienta (jego dane vip czy zwykły) ewentualnie wypożyczenie,

    }
}

