package com.mbpt.nexbank.nexbank_be.controller;

import com.mbpt.nexbank.nexbank_be.dto.AccountDTO;
import com.mbpt.nexbank.nexbank_be.entity.AccountEntity;
import com.mbpt.nexbank.nexbank_be.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/users")
public class CounterController {

    @Autowired
    private CounterRepository userRepository;

    @PostMapping()
    public ResponseEntity<AccountDTO> createUser(@RequestBody AccountDTO user){
        AccountEntity entity = new AccountEntity(user.getUsername(), user.getPassword());
        userRepository.save(entity);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping(value = "/verifyUser")
    public ResponseEntity<String> verifyUser(@RequestBody AccountDTO user){
        AccountEntity userEntity =  userRepository.findUserByUserName(user.getUsername());
        if(userEntity == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not Exists. Please Sign Up");
        }
        if(Objects.equals(userEntity.getUsername(), user.getUsername()) && Objects.equals(userEntity.getPassword(), user.getPassword())){
            return ResponseEntity.ok("Valid user");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid username or password");
    }
}
