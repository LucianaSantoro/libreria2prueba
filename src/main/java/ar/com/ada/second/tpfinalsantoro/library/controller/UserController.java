package ar.com.ada.second.tpfinalsantoro.library.controller;

import ar.com.ada.second.tpfinalsantoro.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping({"/", ""})
    public ResponseEntity getUser() {
        return null;
    }


    @GetMapping({"/id", "id"})
    public ResponseEntity getUserById() {
        return null;
    }

    @PostMapping
    public ResponseEntity postUser() {
        return null;
    }

    @PatchMapping
    public ResponseEntity patchUser() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity deleteUser() {
        return null;
    }

}
