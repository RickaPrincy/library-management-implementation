package RickaPrincy.repository;

import RickaPrincy.model.Subscriber;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubscriberCrudOperations implements CrudOperations<Subscriber>{
    private static final Connection connection = PostgresqlConnection.getConnection();

    public static Subscriber subscriberInstance(ResultSet resultSet) throws SQLException {
        return new Subscriber(
            resultSet.getString("id"),
            resultSet.getString("name"),
            resultSet.getString("sex")
        );
    }

    @Override
    public List<Subscriber> findAll() {
        String query =  Query.selectAll("subscriber");
        List<Subscriber> subscribers = new ArrayList<>();

        try{
            ResultSet resultSet = connection.prepareStatement(query).executeQuery();
            while(resultSet.next()){
                subscribers.add(subscriberInstance(resultSet));
            }
        } catch (SQLException error){
            System.out.println(error.getMessage());
        }

        return subscribers;
    }

    @Override
    public List<Subscriber> saveAll(List<Subscriber> toSave) {
        List<Subscriber> subscribers = new ArrayList<>();
        toSave.forEach(el -> subscribers.add(save(el)));
        return subscribers;
    }

    @Override
    public Subscriber save(Subscriber toSave) {
        String query = Query.create("subscriber", List.of("name", "ref"));
        Subscriber subscriber = null;

        try{
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,toSave.getName());
            statement.setString(2,toSave.getRef());
            statement.executeUpdate();

            ResultSet resultSet = statement.getGeneratedKeys();
            if(resultSet.next()){
                toSave.setId(resultSet.getString(1));
                subscriber = toSave;
            }
        }catch (SQLException error){
            System.out.println(error.getMessage());
        }

        return subscriber;
    }

    @Override
    public Subscriber delete(Subscriber toDelete) {
        return BasicCrud.delete("subscriber", toDelete.getId()) ? toDelete : null;
    }
}
