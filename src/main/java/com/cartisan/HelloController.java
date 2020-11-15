package com.cartisan;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/helloworld")
public class HelloController {
    private HelloWorld helloworld;

    public HelloController(HelloWorld helloworld){
        this.helloworld = helloworld;
    }

    @GetMapping
    public String hello() {
        return helloworld.hello();
    }
}