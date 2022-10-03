package com.matrix.example.demo.config;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Operations {

    private int num;

    public Operations() {
    }

    public void helloWorld(){
        System.out.println("Hello World !!");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Init");
//    }
//
//    @PreDestroy
//    public void shutdown() {
//        System.out.println("Destroy");
//    }
}
