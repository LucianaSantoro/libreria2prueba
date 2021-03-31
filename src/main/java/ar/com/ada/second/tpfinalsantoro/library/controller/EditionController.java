package ar.com.ada.second.tpfinalsantoro.library.controller;

import ar.com.ada.second.tpfinalsantoro.library.service.EditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/edition")
public class EditionController {

    @Autowired
    public EditionService editionService;

    @GetMapping({"/", ""})
    public ResponseEntity getEdition() {
        return null;
    }

    @GetMapping({"/id", "id"})
    public ResponseEntity getEditionById() {
        return null;
    }

    @PostMapping
    public ResponseEntity postEdition() {
        return null;
    }

    @PatchMapping
    public ResponseEntity patchEdition() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity deleteEdition() {
        return null;
    }

}
