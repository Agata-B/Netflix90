package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.resources.Category;

public class exEnum {
    public static void main(String[] args) {
        Category category = Category.DRAMA;
        System.out.println("simple print: " + category);
        System.out.println("toString " + category.toString());
        System.out.println("print name " + category.name());
        System.out.println("pirnt oridinal " + category.ordinal());
        Category category1 = Category.COMEDY;
        System.out.println("toString " + category1.toString());

      /*  System.out.println(Category.DRAMA.getClass());
        System.out.println(Category.DRAMA.getDeclaringClass());
        System.out.println(Category.HORROR.getClass());
        System.out.println(Category.HORROR.getDeclaringClass());
    }

       */
    }
}
