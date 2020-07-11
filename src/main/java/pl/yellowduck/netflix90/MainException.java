package pl.yellowduck.netflix90;

import com.fasterxml.jackson.databind.exc.ValueInstantiationException;

public class MainException {
    public static void main(String[] args) {
    }

    private static void m1() {
        m2();
    }

    private static void m2() {
        m3();
    }

    private static void m3() {
  //      throw new ValueInstantiationException("aa");
    }


    class ValidationException extends Exception {
        ValidationException(String aa) {
super();
        }
    }
}
