package RickaPrincy.utils;

import java.util.List;

public class Utils {
    public static <T> void printList(List<T> lists){
        lists.forEach(System.out::println);
        System.out.println("\n");
    }
}
