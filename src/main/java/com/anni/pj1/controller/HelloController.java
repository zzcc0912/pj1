package com.anni.pj1.controller;

import com.anni.pj1.Properties.ImagesProperties;
import com.anni.pj1.entity.FileEntity;
import com.anni.pj1.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@RestController
public class HelloController {

    @Autowired
    private PhotoService ps;

    @Autowired
    private ImagesProperties ip;

    @RequestMapping(value = "/test",method = {RequestMethod.GET})
    public ModelAndView index() {
        System.out.println("HelloController start....");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");

        FileEntity pe = new FileEntity();
//        pe.setAddress("123");
//        pe.setPhotoName("phtoname");
        ArrayList al = new ArrayList<>();
        al.add(pe);
        mv.addObject("yearList", al);
        return mv;

    }
}
