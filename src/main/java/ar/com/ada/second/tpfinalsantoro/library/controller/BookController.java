package ar.com.ada.second.tpfinalsantoro.library.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @GetMapping({"/", ""})
    public ResponseEntity getAuthor() {
        return null;
    }

    @GetMapping({"/id", "id"})
    public ResponseEntity getAuthorById() {
        return null;
    }

    @PostMapping
    public ResponseEntity postAuthor() {
        return null;
    }

    @PatchMapping
    public ResponseEntity patchAuthor() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity deleteAuthor() {
        return null;
    }

}
