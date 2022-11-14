package com.matrix.example.demo.dao.repository;

import com.matrix.example.demo.dao.entity.AboutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AboutRepository extends JpaRepository<AboutEntity, Integer> {
    Optional<AboutEntity> findById(Integer id);

}


