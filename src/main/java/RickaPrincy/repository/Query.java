package RickaPrincy.repository;

import java.util.List;
import java.util.stream.Collectors;

public class Query {
    public static String selectAll(String tableName){
        return "SELECT * FROM \"" + tableName + "\";";
    }

    public static String create(String tableName, List<String> columns){
        String query = "INSERT INTO \"" + tableName + "\"(";
        query += columns.stream().map(el -> " \"" + el + "\" ").collect(Collectors.joining(", "));
        query += ") VALUES ( ?" + ", ?".repeat(columns.size() - 1) + " );";
        return query;
    }
}
