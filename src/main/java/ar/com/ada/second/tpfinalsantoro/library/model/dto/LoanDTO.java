package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LoanDTO implements Serializable {

    private Long id;

    public LoanDTO(Long id, String name) {
    }

    // TODO: 30/3/2021   acá falta información pero no sabria cual

}
