package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UnitDTO implements Serializable {

    @NotBlank(message = "Book's fisical condition is required.") // TODO: 28/3/2021 de donde viene esta info? no tiene sentido
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "Author's biography contains invalid characters.")
    private String unitCondition;

    public UnitDTO(Long id, String name) {
    }

    public Boolean hasNullOrEmptyAttributes() {
        return unitCondition == null || unitCondition.trim().isEmpty();

    }

}


