package com.matrix.example.demo.dao.repository;

import com.matrix.example.demo.dao.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ServiceRepository extends JpaRepository<ServiceEntity,Integer> {
    Optional<ServiceEntity> findById(Integer id);
}
