package com.matrix.example.demo.dao.repository;

import com.matrix.example.demo.dao.entity.GallaryEntity;
import com.matrix.example.demo.enums.IceCreamCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface GallaryRepository extends JpaRepository<GallaryEntity,Integer> {


    @Query(value = "SELECT * FROM  gallary"
            + " WHERE ice_cream_type='Cone'" +
            "  LIMIT 2 ",
            nativeQuery = true)
    List<GallaryEntity> showIceCreamCone();


    @Query(value = "SELECT * FROM  gallary"
            + " WHERE ice_cream_type='Vanilla'" +
            "  LIMIT 2 ",
            nativeQuery = true)
    List<GallaryEntity> showIceCreamVanilla();

    @Query(value = "SELECT * FROM  gallary"
            + " WHERE ice_cream_type='Chocolate'" +
            "  LIMIT 2 ",
            nativeQuery = true)
    List<GallaryEntity> showIceCreamChocolate();


    @Query(value = "select c from GallaryEntity c where c.icecreamType=:Cone")
    List<GallaryEntity> findByCategoryCone(IceCreamCategory Cone);

    @Query(value = "select c from GallaryEntity c where c.icecreamType=:Vanilla ")
    List<GallaryEntity> findByCategoryVanilla(IceCreamCategory Vanilla);

    @Query(value = "select c from GallaryEntity c where c.icecreamType=:Chocolate")
    List<GallaryEntity> findByCategoryChocolate(IceCreamCategory Chocolate);


}

