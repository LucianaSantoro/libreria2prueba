package ar.com.ada.second.tpfinalsantoro.library.controller;


import ar.com.ada.second.tpfinalsantoro.library.model.dto.AuthorDTO;
import ar.com.ada.second.tpfinalsantoro.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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


    return null;
    }

    @GetMapping({"/{id}", "{id}"})
    public ResponseEntity getAuthorById(@PathVariable Long authorID) {
        return null;
    }

    @PostMapping({"/", ""})
    public ResponseEntity postAuthor(@Valid @RequestBody AuthorDTO author) {

        return null;
    }

    @PatchMapping({"/{id}", "{id}"})
    public ResponseEntity patchAuthor() {
        return null;
    }

    @DeleteMapping({"/{id}", "{id}"})
    public ResponseEntity deleteAuthor() {
        return null;
    }
}
