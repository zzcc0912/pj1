package com.anni.pj1.entity;

import org.springframework.stereotype.Component;

@Component
public class FileEntity {

    private String fileName;

    private String path;

    private String year;

    private String month;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setPath(String path) {
        String newPath = path.split("static")[1];
        this.path = newPath;
    }
}
