package ar.com.ada.second.tpfinalsantoro.library.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Date birthdate;

    @Column(nullable = false)
    private String studies;

    @Column(nullable = false)
    private Boolean working;

    @Column(nullable = false)
    private Boolean studying;


    /* @ManyToMany (mappedBy = "users")
    private List<Loan> loans;

     */
}
