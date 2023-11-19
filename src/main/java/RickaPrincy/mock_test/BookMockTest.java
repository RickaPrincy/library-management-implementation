package RickaPrincy.mock_test;

import RickaPrincy.model.Book;
import RickaPrincy.model.Topic;
import RickaPrincy.repository.BookCrudOperations;

import java.sql.Date;
import java.util.List;

public class BookMockTest {
    private final static BookCrudOperations bookCrudOperations = new BookCrudOperations();
    public static void launch(){
        /* should return 3 books */
        Utils.printList(bookCrudOperations.findAll());

        /* should return the new book created with uuid id*/
        System.out.println(bookCrudOperations.save(
            new Book( "", "bookName_4", 200, Date.valueOf("2023-01-01"), List.of(Topic.COMEDY), null)
        ));

        /* should return list new author with uuid id */
        Utils.printList(bookCrudOperations.saveAll(List.of(
            new Book( "", "bookName_5", 200, Date.valueOf("2023-02-01"), List.of(Topic.ROMANCE, Topic.OTHER), null),
            new Book( "", "bookName_6", 200, Date.valueOf("2023-03-01"), List.of(Topic.OTHER), null)
        )));

        /* should return 6 books */
        Utils.printList(bookCrudOperations.findAll());
    }
}
