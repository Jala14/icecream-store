package com.matrix.example.demo.model;



public class ServiceDto {
    private Integer id;
    private String title;
    private String text;
    private String image;
    private String clientName;
    private String clientImage;
    private String clientSay;

    public ServiceDto(Integer id, String title, String text, String image, String clientName, String clientImage, String clientSay) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.image = image;
        this.clientName = clientName;
        this.clientImage = clientImage;
        this.clientSay = clientSay;
    }

    public ServiceDto() {
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
        return "ServiceDto{" +
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
