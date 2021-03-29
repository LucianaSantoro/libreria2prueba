package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import ar.com.ada.second.tpfinalsantoro.library.model.mapper.converter.YearAttributeConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EditionDTO implements Serializable {

    private Long id;

    @NotBlank(message = "Publishing place is required.")
    private String publishingPlace;

    @NotBlank(message = "Book's publishing date is required.")
    private Date year;

    @NotBlank(message = "Book's publishing house is required.")
    private String publishingHouse;
}



