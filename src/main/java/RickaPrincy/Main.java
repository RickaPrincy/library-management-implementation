package RickaPrincy;

import RickaPrincy.mock_test.AuthorMockTest;
import RickaPrincy.mock_test.BookMockTest;
import RickaPrincy.mock_test.SubscriberMockTest;
import RickaPrincy.repository.PostgresqlConnection;

public class Main {
    public static void main(String[] args) {
        AuthorMockTest.launch();
        BookMockTest.launch();
        SubscriberMockTest.launch();
        PostgresqlConnection.closeConnection();
    }
}