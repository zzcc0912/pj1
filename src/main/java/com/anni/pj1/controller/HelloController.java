package com.anni.pj1.controller;

import com.anni.pj1.Properties.ImagesProperties;
import com.anni.pj1.entity.FileEntity;
import com.anni.pj1.service.PhotoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private PhotoService ps;

    @Autowired
    private ImagesProperties ip;

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/getPhotoList",method = {RequestMethod.GET})
    public List<FileEntity> getPhotoList(@RequestParam("year") String year) {
        logger.info("/getPhotoList start....");

        List<FileEntity> itemPagePhotoList = ps.doGetPagePhotoList(ip.getPath(), year,true);
        return itemPagePhotoList;
    }

    @RequestMapping(value = "/getYearList",method = {RequestMethod.GET})
    public List<FileEntity> getYearList(){
        logger.info("/getYearList start....");
        List<FileEntity> yearList = ps.doGetList(ip.getPath(),true);
        return yearList;
    }

    @RequestMapping(value = "/getMonthPhotoList",method = {RequestMethod.GET})
    public List<FileEntity> getMonthPhotoList(@RequestParam("year") String year, @RequestParam("month") String month){
        logger.info("/getMonthPhotoList start....");
        List<FileEntity> monthPhotoList = ps.doGetMonthPhotoList(ip.getPath(), year, month ,false);
        return monthPhotoList;
    }
}
