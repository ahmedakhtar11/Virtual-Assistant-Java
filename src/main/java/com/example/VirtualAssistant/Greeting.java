package com.example.VirtualAssistant;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    @RequestMapping("/")
    public String index() {
        return "Welcome to my Virtual Assistant App.";
    }

}
