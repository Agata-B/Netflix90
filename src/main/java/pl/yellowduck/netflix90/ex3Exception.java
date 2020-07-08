package pl.yellowduck.netflix90;

import java.sql.SQLException;

public class ex3Exception {
    public static void main(String[] args) throws SQLException {
        try {
            test();
        } catch (IllegalAccessError e) {
            System.out.println("error handler !!! " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("error handler ## " + e.getMessage());
        } finally {
            System.out.println("Always call");
        }
    }

// jekie typy wyjatkow, jak je tworzyc, jak je obslugiwac, jest blok finally który wykonuje się zawsze


    private static void test() throws SQLException {
        if (true) {
            throw new SQLException("error - problem żródłowy");
        }
        System.out.println("successfull call test method");
    }

}
