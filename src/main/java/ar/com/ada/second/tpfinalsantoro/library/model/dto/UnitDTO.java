package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UnitDTO implements Serializable {

    @NotBlank(message = "Book's fisical condition is requiered.") // TODO: 28/3/2021 de donde viene esta info? no tiene sentido
    private String unitCondition;

}


