package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BookDTO implements Serializable {

    private Long id;

    @NotBlank(message = "Author's name is required.")
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "Author's name contains invalid characters.")

    private String author; // TODO: 28/3/2021 si se encima con autor, tiene que poner el nombre o el id?
    // TODO: 29/3/2021 este atributo contendría el nombre Y el apellido... duplicación de atributos?

    @NotBlank(message = "Book's title is required.")
    @Pattern(regexp = "^[0-9a-zA-ZáéíóúÁÉÍÓÚÜüñÑ\\s]*$", message = "Book's title contains invalid characters.")
    private String title;

    private String subtitle;

    @NotBlank(message = "Total books units are required.")
    @Pattern(regexp = "^[0-9\\s]*$", message = "Total book unit contain invalid characters.")
    private Integer units; // TODO: 28/3/2021 hace falta? de donde viene la informacion de cantidad de unidades?

    public BookDTO(Long id, String name) {
    }

    public Boolean hasNullOrEmptyAttributes() {
        return author == null || author.trim().isEmpty()
                || title == null || title.trim().isEmpty()
                || units == null;
    }


}
