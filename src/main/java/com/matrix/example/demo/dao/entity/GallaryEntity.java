package com.matrix.example.demo.dao.entity;
import javax.persistence.*;

@Entity
@Table(name="gallery")
public class GallaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "image")
    private String image;


    public GallaryEntity() {
    }

    public GallaryEntity(Integer id, String image) {
        this.id = id;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "GallaryEntity{" +
                "id=" + id +
                ", image='" + image + '\'' +
                '}';
    }
}