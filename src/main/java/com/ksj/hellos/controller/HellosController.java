package com.ksj.hellos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HellosController {

    @GetMapping("/")
    public String hellos(){
        return "hellos";
    }

    @GetMapping("/ksj")
    public String ksj(){
        return "ksj";
    }
}
