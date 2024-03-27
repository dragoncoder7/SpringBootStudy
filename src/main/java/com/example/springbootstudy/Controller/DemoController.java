package com.example.springbootstudy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/demo")
public class DemoController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        //todo
        return "test";
    }
}
