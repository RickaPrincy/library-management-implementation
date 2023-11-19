package RickaPrincy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String id, bookName;
    private int pageNumbers;
    private Date releaseDate;
    private List<Topic> topics;
    private Author author;
}