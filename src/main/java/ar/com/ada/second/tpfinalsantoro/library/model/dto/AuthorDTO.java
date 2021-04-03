package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.xml.bind.v2.TODO;
import lombok.*;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class AuthorDTO implements Serializable {


    private Long id;


    @NotBlank(message = "Author's name is required.")
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "Author's name contains invalid characters.")
    private String name;

    @NotBlank(message = "Author's lastname is required.")
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "Author's lastname contains invalid characters.")
    private String lastName;


    @JsonFormat(pattern = "yyyy") // TODO: 29/3/2021 chequear json format para esto
    @NotBlank(message = "Author's birthdate is required.")
    @PastOrPresent(message = "Author's birthdate must be in the past.")
    private Date birthdate;

    @NotBlank(message = "Author's birthplace is required.")
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "Author's birthplace contains invalid characters.")
    private String birthplace;

    @NotBlank(message = "Brief author's biography is required.")
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "Author's biography contains invalid characters.")
    private String biography;


    public AuthorDTO(Long id, String name) {
    }

    public Boolean hasNullOrEmptyAttributes() {
        return name == null || name.trim().isEmpty()
                || name == null || name.trim().isEmpty()
                || lastName == null || lastName.trim().isEmpty()
                || birthdate == null
                || birthplace == null || birthplace.trim().isEmpty()
                || biography == null || biography.trim().isEmpty();
    }
}
// TODO: 29/3/2021 completar el resto de los ejemplos de json 
/* Json Example
"name": "Stephen",
"lastname": "King",
"birthdate": "",
"birthplace": "",
"biography": "",
| */




