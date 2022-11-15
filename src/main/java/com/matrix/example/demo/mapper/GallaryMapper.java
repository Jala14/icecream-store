package com.matrix.example.demo.mapper;

import com.matrix.example.demo.dao.entity.GallaryEntity;
import com.matrix.example.demo.model.GallaryDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper

public interface GallaryMapper {

    GallaryMapper INSTANCE= Mappers.getMapper(GallaryMapper.class);

    GallaryDto gallaryDto(GallaryEntity gallaryEntity);
}
