package com.spring.rest_with_h2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(path={"/","/home"} )
    public String home(){
        return "<br><div style='text-align:center; color:red; font-size:20px; font-family:cursive'> !!..Home Page..!! </div>";
    }
}
