package RickaPrincy;

import RickaPrincy.repository.AuthorCrudOperations;
import RickaPrincy.utils.Utils;

public class Main {
    public static void main(String[] args) {
        AuthorCrudOperations authorCrudOperations = new AuthorCrudOperations();
        Utils.printList(authorCrudOperations.findAll());
    }
}