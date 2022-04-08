package com.mlsystem.imggus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestContoller {

    @GetMapping
    public String test() {
        return "Hello world";
    }
}
