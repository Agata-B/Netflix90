package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.common.Gender;
import pl.yellowduck.netflix90.films.Actor;
import pl.yellowduck.netflix90.films.Category;
import pl.yellowduck.netflix90.films.Director;
import pl.yellowduck.netflix90.films.VideoCassette;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static pl.yellowduck.netflix90.common.Gender.MALE; //po tym imporcie statycznym nie musimy prefiksowac obiektu Gender.MALE

public class Main2 {


    public static void main(String[] args) {

        Director tommy = new Director("Tommy", "Wiseau", MALE);
        Actor tommyActor = new Actor("Tommy", "Wiseau", MALE);
        Actor juliette = new Actor("Juliette", "Danielle", Gender.FEMALE);
        Actor greg = new Actor("Greg", "Sestero", MALE);

        Set<Actor> actors = new HashSet<>();
        actors.add(tommyActor);
        actors.add(juliette);
        actors.add(greg);

        VideoCassette theRoom = new VideoCassette("VID001", BigDecimal.valueOf(20), "The Room", tommy, Category.DRAMA, actors);


        theRoom.printOut();
    }
}

