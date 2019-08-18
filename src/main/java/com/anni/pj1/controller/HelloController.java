package com.anni.pj1.controller;

import com.anni.pj1.Properties.ImagesProperties;
import com.anni.pj1.entity.FileEntity;
import com.anni.pj1.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private PhotoService ps;

    @Autowired
    private ImagesProperties ip;

    @RequestMapping(value = "/getPhotoList",method = {RequestMethod.GET})
    public List<FileEntity> getPhotoList() {
        System.out.println("HelloController start....");

        List<FileEntity> yearList = ps.doGetList(ip.getPath(),false);
        String year = yearList.get(0).getFileName();
        List<FileEntity> firstPagePhotoListMap = ps.doGetPagePhotoList(ip.getPath(), year,false);
        return firstPagePhotoListMap;
    }

    @RequestMapping(value = "/getYearList",method = {RequestMethod.GET})
    public List<FileEntity> getYearList(){
        List<FileEntity> yearList = ps.doGetList(ip.getPath(),true);
        return yearList;
    }
}
