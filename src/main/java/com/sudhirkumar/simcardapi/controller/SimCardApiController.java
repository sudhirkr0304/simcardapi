package com.sudhirkumar.simcardapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimCardApiController {

    @GetMapping("/")
    public void hello() {

    }
}
