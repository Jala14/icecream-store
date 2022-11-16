package com.matrix.example.demo.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="about")
public class AboutEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;
    @Column(name = "chef_name")
    private String chefName;
    @Column(name = "chef_image")
    private String chefImage;
    @Column(name = "designation")
    private String designation;


    public AboutEntity() {

    }

    public AboutEntity(Integer id, String title, String text, String chefName, String chefImage, String designation) {
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
        return "AboutEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", chefName='" + chefName + '\'' +
                ", chefImage='" + chefImage + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}