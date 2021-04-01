package ar.com.ada.second.tpfinalsantoro.library.controller;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.AuthorDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.UnitDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.dto.UserDTO;
import ar.com.ada.second.tpfinalsantoro.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping({"/", ""})
    public ResponseEntity getUser() {
        List<UserDTO> users = userService.getAll();

        return ResponseEntity
                .ok()
                .body(users);
    }


    @GetMapping({"/{id}", "{id}"})
    public ResponseEntity getUserById(@PathVariable Long userId) {
        UserDTO userById = userService.getById(userId);

        return ResponseEntity
                .ok()
                .body(userById);
    }

    @PostMapping({"/", ""})
    public ResponseEntity postUser(@Valid @RequestBody UserDTO dto) throws URISyntaxException {

        UserDTO newUser = userService.createNew(dto);
        URI uri = new URI("/user/" + newUser.getId());

        return ResponseEntity
                .created(uri)
                .body(newUser);
    }

    @PatchMapping({"/{id}", "{id}"})
    public ResponseEntity patchUser(@RequestBody UserDTO dto, @PathVariable Long userId) {
        UserDTO updatedUser = userService.update(dto, userId);

        return ResponseEntity
                .ok()
                .body(updatedUser);
    }

    @DeleteMapping({"/{id}", "{id}"})
    public ResponseEntity deleteUserById(@PathVariable Long id) {
        userService.remove(id);

        return ResponseEntity
                .noContent()
                .build();
    }

}
