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
@Table(name = "Unit")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String unitCondition;

    @ManyToOne // a edition
    @JoinColumn(name = "Edition_id", nullable = false, foreignKey = @ForeignKey(name = "fk_Unit_Edition")) //todo lazyFetch?
    private Edition edition;

    @OneToMany(mappedBy = "unit") // a loan
    private List<Loan> loans;
}
