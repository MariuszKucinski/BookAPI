package source.model;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Book {
    private long id;
    private String isbnNumber;
    private String name;
    private String author;
    private String publisher;
    private String topic;


}
