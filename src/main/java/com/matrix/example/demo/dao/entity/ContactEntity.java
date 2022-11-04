package com.matrix.example.demo.dao.entity;



import javax.persistence.*;

@Entity
@Table(name = "contact1")
public class ContactEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String yourName;

    @Column(name = "email")
    private String yourEmail;

    @Column(name = "subject")
    private String subject;

    @Column(name = "message")
    private String message;


    public ContactEntity( String yourName, String yourEmail, String subject, String message) {
        this.yourName = yourName;
        this.yourEmail = yourEmail;
        this.subject = subject;
        this.message = message;
    }

    public ContactEntity() {
    }

    public Integer getId() {
        return id;
    }

    public String getYourName() {
        return yourName;
    }

    public String getYourEmail() {
        return yourEmail;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public void setYourEmail(String yourEmail) {
        this.yourEmail = yourEmail;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ContactEntity{" +
                "id=" + id +
                ", yourName='" + yourName + '\'' +
                ", yourEmail='" + yourEmail + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}


