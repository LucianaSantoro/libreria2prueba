package ar.com.ada.second.tpfinalsantoro.library.controller;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.AuthorDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.BookDTO;
import ar.com.ada.second.tpfinalsantoro.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping({"/", ""})
    public ResponseEntity getAuthor() {

        List<BookDTO> books = bookService.getAll();

        return ResponseEntity
                .ok()
                .body(books);

    }

    @GetMapping({"/{id}", "{id}"})
    public ResponseEntity getBook() {
        List<BookDTO> books = bookService.getAll();

        return ResponseEntity
                .ok()
                .body(books);
    }

    @GetMapping({"/id", "id"})
    public ResponseEntity getBookById(@PathVariable Long bookId) {
        BookDTO bookById = bookService.getById(bookId);

        return ResponseEntity
                .ok()
                .body(bookById);
    }

    @PostMapping({ "/author/{authorId}/book", "/author/{authorId}/book/" })
    public ResponseEntity postBook(@Valid @RequestBody BookDTO dto, @PathVariable Long authorId) throws URISyntaxException {
        BookDTO newBook = bookService.createNew(dto);
        URI uri = new URI("/book/" + newBook.getId());

        return ResponseEntity
                .created(uri)
                .body(newBook);
    }

    @PatchMapping({"/{id}", "{id}"})
    public ResponseEntity patchBook(@RequestBody BookDTO dto, @PathVariable Long bookId) {
        BookDTO updatedBook = bookService.update(dto, bookId);

        return ResponseEntity
                .ok()
                .body(updatedBook);
    }

    @DeleteMapping({"/{id}", "{id}"})
    public ResponseEntity deleteBookById(@PathVariable Long id) {
        bookService.remove(id);

        return ResponseEntity
                .noContent()
                .build();
    }

}
