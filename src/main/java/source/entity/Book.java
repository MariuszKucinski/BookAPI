package source.entity;

import lombok.*;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Proxy(lazy = false)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @NotNull
    private String isbnNumber;

    @NotEmpty
    @NotNull
    @Size(min = 5)
    private String title;

    @NotEmpty
    @NotNull
    @Size(min = 2, max = 50)
    private String author;

    @NotEmpty
    @NotNull
    @Size(min=2)
    private String publisher;

    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String type;

    public Book(){}
}
