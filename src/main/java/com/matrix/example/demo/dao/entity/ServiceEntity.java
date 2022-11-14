package com.matrix.example.demo.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="service")
public class ServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="title")
    private String title;
    @Column(name="text")
    private String text;
    @Column(name="image")
    private String image;
    @Column(name="client_name")
    private String clientName;
    @Column(name="client_image")
    private String clientImage;
    @Column(name="client_say")
    private String clientSay;

    public ServiceEntity(Integer id, String title, String text, String image, String clientName, String clientImage, String clientSay) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.image = image;
        this.clientName = clientName;
        this.clientImage = clientImage;
        this.clientSay = clientSay;
    }

    public ServiceEntity() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientImage() {
        return clientImage;
    }

    public void setClientImage(String clientImage) {
        this.clientImage = clientImage;
    }

    public String getClientSay() {
        return clientSay;
    }

    public void setClientSay(String clientSay) {
        this.clientSay = clientSay;
    }

    @Override
    public String toString() {
        return "ServiceEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", image='" + image + '\'' +
                ", clientName='" + clientName + '\'' +
                ", clientImage='" + clientImage + '\'' +
                ", clientSay='" + clientSay + '\'' +
                '}';
    }
}
