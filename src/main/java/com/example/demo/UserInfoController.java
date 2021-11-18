package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserInfoController {

    @GetMapping("/getuser/{name}")
    public String getUserName(@PathVariable String name){
        return name;
    }

}
