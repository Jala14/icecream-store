package com.matrix.example.demo.model;


public class GallaryDto {

    private String image;

    public GallaryDto() {
    }

    public GallaryDto(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "GallaryDto{" +
                "image='" + image + '\'' +
                '}';
    }
}