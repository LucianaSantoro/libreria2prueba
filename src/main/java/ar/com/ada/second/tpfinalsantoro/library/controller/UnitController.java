package ar.com.ada.second.tpfinalsantoro.library.controller;

import ar.com.ada.second.tpfinalsantoro.library.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/unit")
public class UnitController {

    @Autowired
    private UnitService unitService;

    @GetMapping({"/", ""})
    public ResponseEntity getUnit() {
        return null;
    }

    @GetMapping({"/id", "id"})
    public ResponseEntity getUnitById() {
        return null;
    }
    @PostMapping
    public ResponseEntity postUnit() {
        return null;
    }

    @PatchMapping
    public ResponseEntity patchUnit() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity deleteUnit() {
        return null;
    }

}
