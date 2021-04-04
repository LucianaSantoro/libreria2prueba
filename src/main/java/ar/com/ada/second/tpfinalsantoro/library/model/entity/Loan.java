package ar.com.ada.second.tpfinalsantoro.library.model.entity;


import lombok.*;

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


    @ManyToOne //a user
    @JoinColumn(name = "User_id", nullable = false, foreignKey = @ForeignKey(name = "fk_Loan_User")) //todo lazyFetch?
    private User user;
}
