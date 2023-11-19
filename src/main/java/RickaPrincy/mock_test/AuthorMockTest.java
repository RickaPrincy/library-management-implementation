package RickaPrincy.mock_test;

import RickaPrincy.model.Author;
import RickaPrincy.model.Sex;
import RickaPrincy.repository.AuthorCrudOperations;

import java.util.List;

public class AuthorMockTest {
    private final static AuthorCrudOperations authorCrudOperations = new AuthorCrudOperations();
    public static void launch(){
        /* should return 3 authors */
        Utils.printList(authorCrudOperations.findAll());

        /* should return new author with uuid id */
        System.out.println(authorCrudOperations.save(
            new Author("", "authorName_4", Sex.F))
        );

        /* should return list new author with uuid id */
        Utils.printList(authorCrudOperations.saveAll(List.of(
            new Author("", "authorName_5", Sex.M),
            new Author("", "authorName_6", Sex.M)
        )));

        /* should return the author deleted*/
        System.out.println(authorCrudOperations.delete(new Author("authorId_1", "", Sex.F)));
    }
}
