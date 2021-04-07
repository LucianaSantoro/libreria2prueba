package ar.com.ada.second.tpfinalsantoro.library.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class UserHasLoanId implements Serializable {

    private Long id;

    @Column(name = "Loan_id")
    private Long loanId;

    @Column(name = "User_id")
    private Long userId;

}
