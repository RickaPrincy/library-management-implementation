package RickaPrincy;

import RickaPrincy.mock_test.AuthorMockTest;
import RickaPrincy.repository.PostgresqlConnection;

public class Main {
    public static void main(String[] args) {
        AuthorMockTest.launch();
        PostgresqlConnection.closeConnection();
    }
}