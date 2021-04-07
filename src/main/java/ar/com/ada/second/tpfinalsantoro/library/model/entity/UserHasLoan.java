package ar.com.ada.second.tpfinalsantoro.library.model.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User_has_Loan")
public class UserHasLoan {

    @EmbeddedId
    private UserHasLoanId id;

    @ManyToOne
    @MapsId ("userId")
    @JoinColumn(name = "User_id", foreignKey = @ForeignKey(name = "fk_user_has_loan_user"))
    private User user;

    @ManyToOne
    @MapsId("loanId")
    @JoinColumn(name = "Loan_id", foreignKey = @ForeignKey(name = "fk_user_has_loan_loan"))
    private Loan loan;


    private Long availableBooks;

    private Date loanStartDate;

    private Date loanEndDate;

    private Boolean isBookAvailable;
    
}
