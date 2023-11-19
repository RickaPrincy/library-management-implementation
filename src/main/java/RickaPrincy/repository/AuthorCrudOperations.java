package RickaPrincy.repository;

import RickaPrincy.model.Author;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorCrudOperations implements CrudOperations<Author>{
    private final Connection connection = PostgresqlConnection.getConnection();

    public static Author authorInstance(ResultSet resultSet) throws SQLException {
        return new Author(
                resultSet.getString("id"),
                resultSet.getString("name"),
                resultSet.getString("ref")
        );
    }

    @Override
    public List<Author> findAll() {
        String query = "SELECT * from \"author\";";
        List<Author> authors = new ArrayList<>();

        try{
            ResultSet resultSet = connection.prepareStatement(query).executeQuery();
            while(resultSet.next()){
                authors.add(authorInstance(resultSet));
            }
        }
        catch (SQLException error){
            System.out.println(error.getMessage());
        }

        return authors;
    }

    @Override
    public List<Author> saveAll(List<Author> toSave) {
        return null;
    }

    @Override
    public Author save(Author toSave) {
        return null;
    }

    @Override
    public Author delete(Author toDelete) {
        return null;
    }
}
