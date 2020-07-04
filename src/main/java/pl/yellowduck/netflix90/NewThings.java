package pl.yellowduck.netflix90;

import java.math.BigDecimal;

public class NewThings {

    public static void main(String[] args) {
        BigDecimal ref = BigDecimal.valueOf(1);
        BigDecimal sum = ref.add(BigDecimal.valueOf(3));
        System.out.println(ref);
        System.out.println(sum);

        //typy wyliczeniowe Enum nie można po nim dziedziczyć i on tez nie może dziedziczyć


        //typy generyczne - jest pewne zachowanie wspólne które pozwale przechowywać wspólne elementy

        //klasa dziedziczy po jednej klasie poniewaz mogą dpulikowac sie funkcje
    }
}
