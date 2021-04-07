package ar.com.ada.second.tpfinalsantoro.library.model.entity;



import lombok.*;

import java.util.List;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "Loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne //a unit
    @JoinColumn(name = "Unit_id", nullable = false, foreignKey = @ForeignKey(name = "fk_Loan_Unit")) //todo lazyFetch?
    private Unit unit;




 /*   @ManyToMany
    @JoinTable(
            name = "User_has_loan",
            joinColumns = {@JoinColumn(
                    name = "Loan_id",
                    referencedColumnName = "id",
                    foreignKey = @ForeignKey(name = "fk_user_has_loan_loan"))
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "User_id",
                    referencedColumnName = "id",
                    foreignKey = @ForeignKey(name = "fk_user_has_loan_user"))
            }
    )

    private List<User> users;

  */

}
