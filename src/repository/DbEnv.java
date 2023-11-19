package repository;

public class DbEnv{
    final public static String DB_URL = System.getenv("DB_URL");
    final public static String DB_PASSWORD = System.getenv("DB_PASSWORD");
    final public static String DB_USERNAME = System.getenv("DB_USERNAME");
}