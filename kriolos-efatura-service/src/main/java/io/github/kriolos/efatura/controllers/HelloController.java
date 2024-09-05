package io.github.kriolos.efatura.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.kriolos.efatura.services.GetTokenHelper;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("fiscal")
    public String fiscal() {
        return GetTokenHelper.init("289308496","lausdeo156@@!");
    }

    
}
