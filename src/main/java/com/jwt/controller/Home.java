package com.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/welcome")
    public String welcome()
    {
        String text="This is a private page";
        text+="It is not accessible to unauthenticated user";
        return text;
    }

    @GetMapping("/getusers")
    public String getUser()
    {
return "{\"name\":\"Rahul\"}";
    }

}
