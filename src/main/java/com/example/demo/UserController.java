package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class UserController {

    private ConcurrentHashMap<String, String> mapAddress = new ConcurrentHashMap<>();

    @PostMapping("/addresses")
    public void setMapAddress(@RequestParam String name, @RequestParam String address){
        mapAddress.put(name, address);
    }

    @GetMapping("/testA")
    public ConcurrentHashMap<String, String> getMapAddress(){
        return mapAddress;
    }

    @GetMapping("getA/{name}")
    public String getName(@PathVariable String name){
        return mapAddress.get(name);
    }

    @DeleteMapping("delete/{name}")
    public String deleteAddress(@PathVariable String name){
        mapAddress.remove(name);
        return name + "was remove";
    }

}
