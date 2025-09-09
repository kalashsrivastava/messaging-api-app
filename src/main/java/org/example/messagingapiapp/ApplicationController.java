package org.example.messagingapiapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("oracle")
    public String printGreetings() {
        return "Hi Oracle !!";
    }

    @GetMapping
    public String printG() {
        return "Hi Guest !!";
    }
}