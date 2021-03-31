package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import ar.com.ada.second.tpfinalsantoro.library.model.mapper.converter.YearAttributeConverter;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
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
public class EditionDTO implements Serializable {

    private Long id;

    @NotBlank(message = "Publishing place is required.")
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "Book's printing place name contains invalid characters.")
    private String printingPlace;

    @JsonFormat(pattern = "yyyy")
    @NotBlank(message = "Book's publishing date is required.")
    @PastOrPresent(message = "Book's publishing date must be in the past.")
    private Date year;

    @NotBlank(message = "Book's publishing house is required.")
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "Book's publishing place name contains invalid characters.")
    private String publishingHouse;


    public EditionDTO(Long id, String name) {
    }

    public Boolean hasNullOrEmptyAttributes() {
        return printingPlace == null || printingPlace.trim().isEmpty()
                || year == null
                || publishingHouse == null || publishingHouse.trim().isEmpty();
    }

}