package ar.com.ada.second.tpfinalsantoro.library.controller;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.AuthorDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.BookDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.EditionDTO;
import ar.com.ada.second.tpfinalsantoro.library.service.EditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(value = "/edition")
public class EditionController {

    @Autowired
    public EditionService editionService;

    @GetMapping({"/", ""})
    public ResponseEntity getEdition() {
        List<EditionDTO> editions = editionService.getAll();

        return ResponseEntity
                .ok()
                .body(editions);
    }

    @GetMapping({"/id", "id"})
    public ResponseEntity getEditionById(@PathVariable Long editionId) {
        EditionDTO editionById = editionService.getById(editionId);

        return ResponseEntity
                .ok()
                .body(editionById);
    }

    @PostMapping
    public ResponseEntity postEdition(@Valid @RequestBody EditionDTO dto) throws URISyntaxException {
        EditionDTO newEdition = editionService.createNew(dto);
        URI uri = new URI("/edition/" + newEdition.getId());

        return ResponseEntity
                .created(uri)
                .body(newEdition);
    }

    @PatchMapping({"/{id}", "{id}"})
    public ResponseEntity patchEdition(@RequestBody EditionDTO dto, @PathVariable Long editionId) {
        EditionDTO updatedEdition = editionService.update(dto, editionId);

        return ResponseEntity
                .ok()
                .body(updatedEdition);
    }

    @DeleteMapping({"/{id}", "{id}"})
    public ResponseEntity deleteEditionById(@PathVariable Long id) {
        editionService.remove(id);

        return ResponseEntity
                .noContent()
                .build();
    }

}
