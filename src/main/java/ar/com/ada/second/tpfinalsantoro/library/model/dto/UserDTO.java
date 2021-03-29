package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable {

    private Long id;

    @NotBlank(message = "User's name is required.")
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "User's name contains invalid characters.")
    private String name;

    @NotBlank(message = "User's lastname is required.")
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "User's name contains invalid characters.")
    private String lastName;

    @NotBlank(message = "User's birthdate required.")
    @JsonFormat(pattern = "yyyy") // TODO: 29/3/2021 chequear json format para esto
    private Date birthdate;

    @NotBlank(message = "User's studies are required.")
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "User's studies contain invalid characters.")
    private String studies;

    @NotBlank(message = "User must indicate if working.") // TODO: 28/3/2021 suena raro
    // TODO: 29/3/2021 chequear si regex puede ser Y / N
    private Boolean working;

    @NotBlank(message = "User must indicate if studying.")
    // TODO: 29/3/2021 chequear si regex puede ser Y / N
    private Boolean studying;

    public UserDTO(Long id, String name) {
    }

    public Boolean hasNullOrEmptyAttributes() {
        return name == null || name.trim().isEmpty()
                || name == null || name.trim().isEmpty()
                || lastName == null || lastName.trim().isEmpty()
                || birthdate == null
                || studies == null || studies.trim().isEmpty()
                || working == null
                || studying == null;
    }
}
