package RickaPrincy.mock_test;

import RickaPrincy.model.Author;
import RickaPrincy.repository.AuthorCrudOperations;

import java.util.List;

public class AuthorMockTest {
    private final static AuthorCrudOperations authorCrudOperations = new AuthorCrudOperations();
    public static void launch(){
        /* should return 3 authors */
        Utils.printList(authorCrudOperations.findAll());

        /* should return new author with uuid id */
        System.out.println(authorCrudOperations.save(
            new Author("", "authorName_4", "authorRef_4"))
        );

        /* should return list new author with uuid id */
        Utils.printList(authorCrudOperations.saveAll(List.of(
            new Author("", "authorName_5", "authorRef_5"),
            new Author("", "authorName_6", "authorRef_6")
        )));
    }
}
