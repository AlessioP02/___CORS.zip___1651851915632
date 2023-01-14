package co.develhope.corsExample.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {
    @GetMapping
    public String hello(){
        return "Hello!";
    }

}

