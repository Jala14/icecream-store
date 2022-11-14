package com.matrix.example.demo.dao.entity;

import com.matrix.example.demo.enums.IceCreamCategory;

import javax.persistence.*;

@Entity
@Table(name="gallary")
public class GallaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(name = "ice_cream_type")
    private IceCreamCategory icecreamType;
    @Column(name = "ice_cream_image")
    private String icecreamImage;


    public GallaryEntity() {
    }

    public GallaryEntity(Integer id, IceCreamCategory icecreamType, String icecreamImage) {
        this.id = id;
        this.icecreamType = icecreamType;
        this.icecreamImage = icecreamImage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IceCreamCategory getIcecreamType() {
        return icecreamType;
    }

    public void setIcecreamType(IceCreamCategory icecreamType) {
        this.icecreamType = icecreamType;
    }

    public String getIcecreamImage() {
        return icecreamImage;
    }

    public void setIcecreamImage(String icecreamImage) {
        this.icecreamImage = icecreamImage;
    }

    @Override
    public String toString() {
        return "GallaryEntity{" +
                "id=" + id +
                ", icecreamType=" + icecreamType +
                ", icecreamImage='" + icecreamImage + '\'' +
                '}';
    }
}