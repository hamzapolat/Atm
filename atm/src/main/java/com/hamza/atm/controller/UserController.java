package com.hamza.atm.controller;

import com.hamza.atm.model.UserEntity;
import com.hamza.atm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController //REST endpoint’leri üretmeyi sağlamak için kukllanılıyor.
//localhost:8080/all
@RequestMapping(value = "/all", produces ="application/json") //URL ile ilgili tüm işleri yapması sağlar.
public class UserController {


    @Autowired
    private UserRepository userRepository;


    //localhost:8080/all/test
    @RequestMapping("/test")
    public String testMessage() {
        return "message success";
    }

    //localhost:8080/all/test2
    @RequestMapping("/test2")
    public String testMessageTest() {
        return "message success2";
    }

    @PostMapping("save-user")
    public UserEntity saveUser(@RequestBody UserEntity user) {
        return userRepository.save(user);
    }

    @GetMapping("/get-all-users")
    public List<UserEntity> UserAllGet() {
        return userRepository.findAll();
    }
}
