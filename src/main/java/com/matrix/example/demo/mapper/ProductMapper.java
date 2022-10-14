package com.matrix.example.demo.mapper;

import com.matrix.example.demo.dao.entity.ProductEntity;
import com.matrix.example.demo.model.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto mapToDto(ProductEntity productEntity);
}
