package RickaPrincy.repository;

import RickaPrincy.model.Book;
import RickaPrincy.model.Topic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookCrudOperations implements CrudOperations<Book> {
    private final Connection connection = PostgresqlConnection.getConnection();
    public static Book bookInstance(ResultSet resultSet) throws SQLException {
        List<Topic> topics = Arrays.stream((String[]) resultSet.getArray("topics")
                .getArray()).map(Topic::valueOf).toList();
        return new Book(
            resultSet.getString("id"),
            resultSet.getString("book_name"),
            resultSet.getLong("page_numbers"),
            resultSet.getDate("release_date"),
            topics,
            AuthorCrudOperations.getOne(resultSet.getString("id_author"))
        );
    }

    @Override
    public List<Book> findAll() {
        String query =  Query.selectAll("book");
        List<Book> books = new ArrayList<>();

        try{
            ResultSet resultSet = connection.prepareStatement(query).executeQuery();
            while(resultSet.next()){
                books.add(bookInstance(resultSet));
            }
        } catch (SQLException error){
            System.out.println(error.getMessage());
        }

        return books;
    }

    @Override
    public List<Book> saveAll(List<Book> toSave) {
        return null;
    }

    @Override
    public Book save(Book toSave) {
        return null;
    }

    @Override
    public Book delete(Book toDelete) {
        return null;
    }
}
