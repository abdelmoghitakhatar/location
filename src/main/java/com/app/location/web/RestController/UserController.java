package com.app.location.web.RestController;

import com.app.location.service.UserService;
import com.app.location.service.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public ResponseEntity<UserDTO> test(){
        UserDTO information = userService.getInformation();
        return new ResponseEntity<>(information, HttpStatus.OK) ;
    }
}
