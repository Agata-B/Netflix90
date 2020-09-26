package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.films.Category;

public class Main3 {
    public static void main(String[] args) {

        Category category = Category.DRAMA;
        System.out.println("simple print: " + category);
        System.out.println("toString " + category.toString());
        System.out.println("print name " + category.name());
        System.out.println("pirnt oridinal " + category.ordinal());


        Category category1 = Category.COMEDY;
        System.out.println("simple print: " + category1);
        System.out.println("toString " + category1.toString());
        System.out.println("print name " + category1.name());
        System.out.println("pirnt oridinal " + category1.ordinal());


    }
}
