package com.matrix.example.demo.model;

public class AboutDto {
    private Integer id;
    private String title;
    private String text;
    private String chefName;
    private String chefImage;
    private String designation;

    public AboutDto() {

    }

    public AboutDto(Integer id, String title, String text, String chefName, String chefImage, String designation) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.chefName = chefName;
        this.chefImage = chefImage;
        this.designation = designation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public String getChefImage() {
        return chefImage;
    }

    public void setChefImage(String chefImage) {
        this.chefImage = chefImage;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "AboutDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", chefName='" + chefName + '\'' +
                ", chefImage='" + chefImage + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}