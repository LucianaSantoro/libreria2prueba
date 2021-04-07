
package ar.com.ada.second.tpfinalsantoro.library.model.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "Author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45, nullable = false)
    private String name;

    @Column(length = 45, nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Date birthdate;

    @Column(length = 500, nullable = false)
    private String biography;

    @Column(nullable = false)
    private String birthplace;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;




}
