package com.matrix.example.demo.dao.repository.login;

import com.matrix.example.demo.dao.entity.login.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);

}
