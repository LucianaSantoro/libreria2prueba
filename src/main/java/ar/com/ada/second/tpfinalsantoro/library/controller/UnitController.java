package ar.com.ada.second.tpfinalsantoro.library.controller;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.AuthorDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.UnitDTO;
import ar.com.ada.second.tpfinalsantoro.library.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(value = "/unit")
public class UnitController {

    @Autowired
    private UnitService unitService;

    @GetMapping({"/", ""})
    public ResponseEntity getUnit() {
        List<UnitDTO> units = unitService.getAll();

        return ResponseEntity
                .ok()
                .body(units);
    }

    @GetMapping({"/id", "id"})
    public ResponseEntity getUnitById(@PathVariable Long unitId) {
        UnitDTO unitById = unitService.getById(unitId);

        return ResponseEntity
                .ok()
                .body(unitById);
    }
    @PostMapping({"/", ""})
    public ResponseEntity postUnit(@Valid @RequestBody UnitDTO dto) throws URISyntaxException {
        UnitDTO newUnit = unitService.createNew(dto);
        URI uri = new URI("/unit/" + newUnit.getId());

        return ResponseEntity
                .created(uri)
                .body(newUnit);
    }

    @PatchMapping({"/{id}", "{id}"})
    public ResponseEntity patchUnit(@RequestBody UnitDTO dto, @PathVariable Long unitId) {
        UnitDTO updatedUnit = unitService.update(dto, unitId);

        return ResponseEntity
                .ok()
                .body(updatedUnit); }

    @DeleteMapping({"/{id}", "{id}"})
    public ResponseEntity deleteUnitById(@PathVariable Long id) {
        unitService.remove(id);

        return ResponseEntity
                .noContent()
                .build();
    }

}
