package com.anni.pj1.Repository;

import com.anni.pj1.entity.FileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;


@Repository
public class PhotoRepository {

    @Autowired
    private FileEntity fe;

    public ArrayList<FileEntity> getPhototListByPath(String path, boolean isReverse){
        ArrayList<FileEntity> fileDirectoryList = new ArrayList<FileEntity>();
        File file = new File(path);
        File[] fs = file.listFiles();
        for(File f:fs){
//            fe = new FileEntity();

            fe.setFileName(f.getName());
            fe.setPath(f.getPath());
            fileDirectoryList.add(fe);
        }
        if(isReverse) Collections.reverse(fileDirectoryList);
        return fileDirectoryList;
    }
}
