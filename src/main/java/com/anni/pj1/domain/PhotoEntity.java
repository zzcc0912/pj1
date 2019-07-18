package com.anni.pj1.domain;

import org.springframework.stereotype.Repository;

@Repository
public class PhotoEntity {

    private String photoName;

    private String address;

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
