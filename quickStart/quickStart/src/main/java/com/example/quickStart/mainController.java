package com.example.quickStart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {


    @GetMapping("/")
    public String welcome(){
        return "Would you rather";
    }


}
