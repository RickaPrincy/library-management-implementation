import mock_test.AuthorMockTest;
import mock_test.BookMockTest;
import mock_test.SubscriberMockTest;
import repository.PostgresqlConnection;

public class Main {
    public static void main(String[] args) {
        AuthorMockTest.launch();
        BookMockTest.launch();
        SubscriberMockTest.launch();
        PostgresqlConnection.closeConnection();
    }
}