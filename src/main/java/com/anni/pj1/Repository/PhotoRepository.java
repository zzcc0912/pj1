package com.anni.pj1.Repository;

import com.anni.pj1.entity.FileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


@Repository
public class PhotoRepository {

    public ArrayList<FileEntity> getPhototListByPath(String path, boolean isReverse){
        ArrayList<FileEntity> fileDirectoryList = new ArrayList<FileEntity>();
        File file = new File(path);
        File[] fs = file.listFiles();
        for(File f:fs){
            FileEntity fe = new FileEntity();

            fe.setFileName(f.getName());
            fe.setPath(f.getPath());
            fileDirectoryList.add(fe);
        }
        if(isReverse) Collections.reverse(fileDirectoryList);
        return fileDirectoryList;
    }

    public ArrayList<Map> getPagePhototListByYear(String path, String year, boolean isReverse){
        ArrayList<Map> firstPagePhototList = new ArrayList<Map>();
        File file = new File(path + year + "/");
        File[] fs = file.listFiles();
        for(File f:fs){
            if(f.isDirectory()){
                File[] fss = f.listFiles();
                String month = f.getName();
                Map photoMap= new HashMap();

                for(File fssss:fss){
                    FileEntity fe = new FileEntity();

                    fe.setFileName(fssss.getName());
                    fe.setPath(fssss.getPath());
                    photoMap.put(month, fe);
                    firstPagePhototList.add(photoMap);
                    break;
                }
            }
        }
        if(isReverse) Collections.reverse(firstPagePhototList);
        return firstPagePhototList;
    }
}
