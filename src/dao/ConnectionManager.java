package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {



    public static Connection newConnection = establishConnection();

    private static Connection establishConnection() {
        Connection newConnection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            newConnection = DriverManager.getConnection(
                    "jdbc:sqlite:/home/augustyn/Documents/MyCode/Java files/Checkpoint-3/src/library.db");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(00);
        }
        return newConnection;
    }

    public static void closeConnection(Connection connectionToClose) {
        try {
            connectionToClose.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(11);
        }
    }
    public static Connection getNewConnection() {
        return newConnection;
    }
}