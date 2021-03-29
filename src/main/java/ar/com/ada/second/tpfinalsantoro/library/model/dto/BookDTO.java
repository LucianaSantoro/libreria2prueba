package ar.com.ada.second.tpfinalsantoro.library.model.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class BookDTO implements Serializable {

    private Long id;

    @NotBlank(message = "Author's name is required.")
    private String author; // TODO: 28/3/2021 si se encima con autor, tiene que poner el nombre o el id?

    @NotBlank(message = "Book's title is required.")
    private String title;

    private String subtitle;

    @NotBlank(message = "Author's name is required.")
    private Integer units; // TODO: 28/3/2021 hace falta? de donde viene la informacion de cantidad de unidades?

}
