package dev.Sapna.EcomUserService.controller;

import dev.Sapna.EcomUserService.dto.loginRequestDTO;
import dev.Sapna.EcomUserService.dto.signUpRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody loginRequestDTO loginRequestDTO){
        return null;
    }

    @GetMapping("/logout")
    public ResponseEntity logout(){
        return null;
    }

    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody signUpRequestDTO signUpRequestDTO){
        return null;
    }

    @GetMapping("/validate")
    public ResponseEntity validate(){
        return null;
    }

}
