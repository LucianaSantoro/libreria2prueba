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
                    name = "Book_id",
                    referencedColumnName = "id",
                    foreignKey = @ForeignKey(name = "fk_Author_has_Book_Book"))
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "Author_id",
                    referencedColumnName = "id",
                    foreignKey = @ForeignKey(name = "fk_Author_has_Book_Author"))
            }
    )
    private Set<Author> authors;

    @OneToMany(mappedBy = "book")
    private List<Edition> editions ;


}
