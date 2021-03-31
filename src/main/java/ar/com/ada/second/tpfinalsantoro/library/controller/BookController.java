package ar.com.ada.second.tpfinalsantoro.library.controller;

import ar.com.ada.second.tpfinalsantoro.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping({"/", ""})
    public ResponseEntity getBook() {
        return null;
    }

    @GetMapping({"/id", "id"})
    public ResponseEntity getBookById() {
        return null;
    }

    @PostMapping
    public ResponseEntity postBook() {
        return null;
    }

    @PatchMapping
    public ResponseEntity patchBook() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity deleteBook() {
        return null;
    }

}
