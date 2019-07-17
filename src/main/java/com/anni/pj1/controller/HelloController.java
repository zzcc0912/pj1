package com.anni.pj1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @RequestMapping(value = "/",method = {RequestMethod.GET})
    public ModelAndView index() {
        System.out.println("HelloController start....");
        return new ModelAndView("index");

    }
}
