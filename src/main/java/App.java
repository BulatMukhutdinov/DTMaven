import java.sql.*;

public class App {
    public static final String HOST = "jdbc:redshift://dt.ctueqkiqocnw.us-west-2.rds.amazonaws.com";
    public static final String PORT = "5432";
    private static final String URL = "DT";
    private static final String USER = "DT";
    private static final String PASS = "DoubleTrouble";

    public static void main(String args[]) {
        try {
            Connection connection = DriverManager.getConnection(
                    HOST + ":" + PORT + "/" + URL, USER,
                    PASS);
            System.out.println("Success!");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Due to next reasons: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
