package com.anni.pj1.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FileEntity {

    private String fileName;

    private String path;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
