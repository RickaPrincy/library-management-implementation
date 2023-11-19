package RickaPrincy.mock_test;

import RickaPrincy.repository.BookCrudOperations;

public class BookMockTest {
    private final static BookCrudOperations bookCrudOperations = new BookCrudOperations();
    public static void launch(){
        /* should return 3 books */
        Utils.printList(bookCrudOperations.findAll());
    }
}
