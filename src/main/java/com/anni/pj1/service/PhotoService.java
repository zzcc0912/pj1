package com.anni.pj1.service;

import com.anni.pj1.Repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository pr;

    public ArrayList<String> doGetList(String path, boolean isReverse){
        //return pr.getPhototListByPath(path, isReverse);
        return null;
    }
}
