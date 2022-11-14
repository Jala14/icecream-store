package com.matrix.example.demo.dao.repository;

import com.matrix.example.demo.dao.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {
}
