package ar.com.ada.second.tpfinalsantoro.library.controller;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.AuthorDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.EditionDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.LoanDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Edition;
import ar.com.ada.second.tpfinalsantoro.library.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(value = "/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping({"/", ""})
    public ResponseEntity getLoan() {

        List<LoanDTO> loans = loanService.getAll();

        return ResponseEntity
                .ok()
                .body(loans);
    }

    @GetMapping({"/id", "id"})
    public ResponseEntity getLoanById(@PathVariable Long editionId) {
        LoanDTO loanById = loanService.getById(editionId);

        return ResponseEntity
                .ok()
                .body(loanById);
    }
    @PostMapping({"/", ""})
    public ResponseEntity postLoan(@Valid @RequestBody LoanDTO dto) throws URISyntaxException {
        LoanDTO newLoan = loanService.createNew(dto);
        URI uri = new URI("/edition/" + newLoan.getId());

        return ResponseEntity
                .created(uri)
                .body(newLoan);
    }

    @PatchMapping({"/{id}", "{id}"})
    public ResponseEntity patchLoan(@RequestBody LoanDTO dto, @PathVariable Long loanId) {
        LoanDTO updatedLoan = loanService.update(dto, loanId);

        return ResponseEntity
                .ok()
                .body(updatedLoan);
    }

    @DeleteMapping({"/{id}", "{id}"})
    public ResponseEntity deleteLoanById(@PathVariable Long id) {
        loanService.remove(id);

        return ResponseEntity
                .noContent()
                .build();
    }

}
