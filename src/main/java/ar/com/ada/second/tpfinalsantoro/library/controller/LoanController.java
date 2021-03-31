package ar.com.ada.second.tpfinalsantoro.library.controller;

import ar.com.ada.second.tpfinalsantoro.library.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping({"/", ""})
    public ResponseEntity getLoan() {
        return null;
    }

    @GetMapping({"/id", "id"})
    public ResponseEntity getLoanById() {
        return null;
    }
    @PostMapping
    public ResponseEntity postLoan() {
        return null;
    }

    @PatchMapping
    public ResponseEntity patchLoan() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity deleteLoan() {
        return null;
    }

}
