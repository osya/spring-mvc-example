package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by info_000 on 20-Apr-17.
 */
@RestController
public class HomeController {
    @GetMapping("/")
    public String hello()
    {
        return "Hello";
    }
}

//TODO: Upgrade to JDK 9