package com.matrix.example.demo.mapper;


import com.matrix.example.demo.dao.entity.AboutEntity;
import com.matrix.example.demo.model.AboutDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AboutMapper {

    AboutMapper INSTANCE = Mappers.getMapper(AboutMapper.class);

    AboutDto aboutToDto(AboutEntity aboutEntity);
}
