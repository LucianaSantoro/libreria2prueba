package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserHasLoanDTO implements Serializable {


    private Long id;

    @NotBlank(message = "Available books quantity is required.")
    @Pattern(regexp = "^[0-9\\s]*$", message = "Available books quantity contains invalid characters.")
    private Long availableBooks;

    private Date loanStartDate;

    private Date loanEndDate;

    private Boolean isBookAvailable;

}
