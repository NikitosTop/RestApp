package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserInfoController {

    @PostMapping("/user")
    public String userStatus(@RequestBody String user){
        return user;
    }

    @GetMapping("/getuser/{name}")
    public String getUserName(@PathVariable String name){
        return name;
    }

}
