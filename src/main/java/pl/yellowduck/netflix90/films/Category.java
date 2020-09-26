package pl.yellowduck.netflix90.films;

import pl.yellowduck.netflix90.resources.Discontable;

public enum Category implements Discontable {

    COMEDY(4, "Fanny films.") {
        @Override
        public String toString() {
            return "Haha";
        }
    },  //ordinal value 0 ; lepiej nie używać ordinal bo jak ktoś wpisze coś pomiedzy to zmienią się numery

    FANTASY(10, "Sci-fy films"),
    DRAMA(2, "Sad films"),
    HORROR(0, "Scary films"),
    MUSICAL(2, "Sing films"),
    ACTION(3, "Shot and drive films");


    private final int discount;  // w enum pamiętać o oznaczaniu pół jako finalnych, żeby nie zmieniały się przez okres życia aplikacji
    private final String description;

    Category(int discount, String description) {
        this.discount = discount;
        this.description = description;
    }

    public int getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name() + " " + description;
    }

    @Override
    public int discount() {
        return 0;
    }


}
