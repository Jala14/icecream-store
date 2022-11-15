package com.matrix.example.demo.dao.repository;

import com.matrix.example.demo.dao.entity.GallaryEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface GallaryRepository extends JpaRepository<GallaryEntity,Integer> {
    Optional<GallaryEntity> findById(Integer id);

}

