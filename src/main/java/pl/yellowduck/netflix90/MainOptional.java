package pl.yellowduck.netflix90;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {
        Optional <String> someString = getSomeString();
        if (someString.isPresent()) {
            String s = someString.get();
            char c = s.charAt(5);
        }
    }


    private static Optional<String> getSomeString() {
        return Optional.of("example");
    }
}

