package pl.yellowduck.netflix90;

public class exException {
    public static void main(String[] args) {
        test();
    }

    private static void test() throws IllegalStateException {
        if (true) {
            throw new IllegalStateException("error");
        }
        System.out.println("after error");
    }
}

