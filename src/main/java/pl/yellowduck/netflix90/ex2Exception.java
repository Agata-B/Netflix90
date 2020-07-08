package pl.yellowduck.netflix90;

public class ex2Exception {
    public static void main(String[] args) {
        try {
            test();
            } catch (IllegalAccessError e ){
            System.out.println("error handler !!! " + e.getMessage());
        }  catch (IllegalStateException e ){
            System.out.println("error handler ## " + e.getMessage());
        } finally {
            System.out.println("Always call");
        }
    }

    private static void test() throws IllegalStateException {
   //     if (true) {
     //       throw new IllegalStateException("error - problem żródłowy");
       // }
        System.out.println("successfull call test method");
    }
}
