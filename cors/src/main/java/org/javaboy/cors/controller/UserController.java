package org.javaboy.cors.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("get")
    //@CrossOrigin(origins = "http://localhost:8081")
    public String get(){
        return "hello";
    }
}
