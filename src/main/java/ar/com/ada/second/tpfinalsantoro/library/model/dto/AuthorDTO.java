package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import lombok.*;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class AuthorDTO implements Serializable {


    private Long id;

    @NotBlank(message = "Author's name is requiered.")
    private String name;

    @NotBlank(message = "Author's lastname is requiered.")
    private String lastName;

    @NotBlank(message = "Author's birthdate is requiered.")
    private Date birthdate;

    @NotBlank(message = "Brief author's biography is requiered.")
    private String biography;

    @NotBlank(message = "Author's birthplace is requiered.")
    private String birthplace;
    
}
