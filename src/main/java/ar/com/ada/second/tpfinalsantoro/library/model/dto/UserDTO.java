package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable {

    private Long id;

    @NotBlank(message = "User's name is requiered.")
    private String name;

    @NotBlank(message = "User's lastname is requiered.")
    private String lastName;

    @NotBlank(message = "User's birthdate requiered.")
    private Date birthdate;

    @NotBlank(message = "User's studies are requiered.")
    private String studies;

    @NotBlank(message = "User must indicate if working.") // TODO: 28/3/2021 suena raro
    private Boolean working;

    @NotBlank(message = "User must indicate if studying.")
    private Boolean studying;

}
