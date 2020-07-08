package pl.yellowduck.netflix90;


import org.apache.commons.lang3.StringUtils;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class MainSteram {
    public static void main(String[] args) {

        List<String> capitals = List.of("Warsaw", "Berlin", "Amsterdam", "Lisbona", "Paris", "Rome", "London");

      /*  List<String> capitalsWithW = new ArrayList<>();
      for (String capital: capitals) {            // wypisz te co zaczynaja sie na w
            if (capital.startsWith("W")){

            } System.out.println(capital);
        }
*/

        capitals.stream().filter(p -> p.startsWith("W")).collect(Collectors.toSet());

        Set<String> capitalsLReverse = new HashSet<>();
        for (String capital : capitals) {            // wypisz te co zaczynaja sie na w
            if (capital.startsWith("L")) {
                capitalsLReverse.add(StringUtils.reverse(capital.toUpperCase()));
            }
        }
        System.out.println(capitalsLReverse);


        capitals.stream()
                .filter(p -> p.startsWith("L"))
                .map(String::toUpperCase)
                .map(StringUtils::reverse)
                .collect(Collectors.toSet());
        System.out.println(capitalsLReverse);

        capitals.stream()
                .filter(p -> p.startsWith("o"))
                .findAny()
                .ifPresentOrElse(p -> System.out.println(p),
                        () -> {
                            System.out.println("Nie znaleziono");
                            System.out.println("To moze byc bład kodu");
                        });    //()-> gdy nie znajdzie zrób cos
    }
}
