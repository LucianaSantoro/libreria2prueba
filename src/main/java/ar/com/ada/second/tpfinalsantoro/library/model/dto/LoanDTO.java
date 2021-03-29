package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoanDTO implements Serializable {

    private Long id;

    public LoanDTO(Long id, String name) {
    }

}
