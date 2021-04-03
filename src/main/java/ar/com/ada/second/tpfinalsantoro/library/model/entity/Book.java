package ar.com.ada.second.tpfinalsantoro.library.model.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 100, nullable = true)
    private String subtitle;

    @Column(nullable = false)
    private Integer units;

    @ManyToMany
    @JoinTable(
            name = "Author_has_book",
            joinColumns = {@JoinColumn(
                    name = "Author_id",
                    referencedColumnName = "id",
                    foreignKey = @ForeignKey(name = "fk_author_id"))
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "Book_id",
                    referencedColumnName = "id",
                    foreignKey = @ForeignKey(name = "fk_book_id"))
            }
    )
    private Set<Author> authors;

    @OneToMany(mappedBy = "editions")
    private List<Book> books;


}
