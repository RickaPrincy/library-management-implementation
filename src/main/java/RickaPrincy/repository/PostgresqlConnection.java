package RickaPrincy.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlConnection{
    private static Connection connection;

    public static Connection getConnection(){
        if(connection != null)
            return connection;

        try{
            connection = DriverManager.getConnection(
                    DbEnv.DB_URL,
                    DbEnv.DB_USERNAME,
                    DbEnv.DB_PASSWORD
            );
            return connection;
        }
        catch (SQLException error){
            System.out.println(error.getMessage());
            throw new RuntimeException("Connection failed");
        }
    }

    public static void closeConnection(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}