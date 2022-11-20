package com.matrix.example.demo.service.login;

public interface SecurityService {
    void autoLogin(String username,String password);
    boolean isAuthenticated();
}
