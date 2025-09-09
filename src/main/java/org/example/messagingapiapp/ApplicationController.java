package org.example.messagingapiapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/softbank/api/accounts")
public class ApplicationController {

    @GetMapping("oracle")
    public String printGreetings() {
        return "Hi Oracle !!";
    }

    @GetMapping
    public String print() {
        return "Hi Guest !!";
    }
}