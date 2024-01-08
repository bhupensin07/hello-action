package com.example.azureaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ActionController {

    @GetMapping("/action")
    public String sayHello(){
        return "Hello...";
    }
}
