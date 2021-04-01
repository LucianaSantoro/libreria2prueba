package ar.com.ada.second.tpfinalsantoro.library.controller;


import ar.com.ada.second.tpfinalsantoro.library.model.dto.AuthorDTO;

import ar.com.ada.second.tpfinalsantoro.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@RestController
@RequestMapping(value = "/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping({"/", ""})
    public ResponseEntity getAuthor() {

        List<AuthorDTO> authors = authorService.getAll();

        return ResponseEntity
                .ok()
                .body(authors);

    }

    @GetMapping({"/{id}", "{id}"})
    public ResponseEntity getAuthorById(@PathVariable Long authorId) {
        AuthorDTO authorById = authorService.getById(authorId);

        return ResponseEntity
                .ok()
                .body(authorById);
    }

    @PostMapping({"/", ""})
    public ResponseEntity postAuthor(@Valid @RequestBody AuthorDTO dto) throws URISyntaxException {

        AuthorDTO newAuthor = authorService.createNew(dto);
        URI uri = new URI("/author/" + newAuthor.getId());

        return ResponseEntity
                .created(uri)
                .body(newAuthor);
    }

    @PatchMapping({"/{id}", "{id}"})
    public ResponseEntity patchAuthorById(@RequestBody AuthorDTO dto, @PathVariable Long authorId) {
        // TODO: 31/3/2021 debería ser acá también por id de libro? me parece que es demasiado
        AuthorDTO updatedAuthor = authorService.update(dto, authorId);

        return ResponseEntity
                .ok()
                .body(updatedAuthor);

    }

    @DeleteMapping({"/{id}", "{id}"})
    public ResponseEntity deleteAuthorById(@PathVariable Long id) {
        authorService.remove(id);

        return ResponseEntity
                .noContent()
                .build(); // TODO: 31/3/2021 por qué build?
    }
}
