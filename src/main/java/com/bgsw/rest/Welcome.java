package com.bgsw.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
     @GetMapping("/welcome")
    public String sayHello(){

        return "We are learning REST API design";
    }


    @GetMapping("/welcome/{name}")
    public String sayHelloUser( @PathVariable String name){

        return "Welcome to BGSW"+ name;
    }

}
