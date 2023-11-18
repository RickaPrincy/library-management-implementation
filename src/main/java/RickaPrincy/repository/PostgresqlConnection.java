package RickaPrincy.repository;

import lombok.Getter;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.DriverManager;
import java.sql.Statement;

@Getter
public class PostgresqlConnection{
    private Connection connection;
    private Statement statement;
    private static PostgresqlConnection oneInstance;
    private PostgresqlConnection(){
        try {
            this.connection = DriverManager.getConnection(
                    DbEnv.DB_URL,
                    DbEnv.DB_USERNAME,
                    DbEnv.DB_PASSWORD
            );
            this.statement = this.connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static PostgresqlConnection getNewInstance() {
        if(PostgresqlConnection.oneInstance == null){
            PostgresqlConnection.oneInstance = new PostgresqlConnection();
        }
        return PostgresqlConnection.oneInstance;
    }

    public void closeConnection(){
        try {
            this.connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}