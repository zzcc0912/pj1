package com.anni.pj1.service;

import com.anni.pj1.Repository.PhotoRepository;
import com.anni.pj1.entity.FileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository pr;

    public ArrayList<FileEntity> doGetList(String path, boolean isReverse){
        return pr.getPhototListByPath(path, isReverse);
    }

    public ArrayList<FileEntity> doGetPagePhotoList(String path, String year, boolean isReverse) {
        return pr.getPagePhototListByYear(path, year, isReverse);
    }
}
