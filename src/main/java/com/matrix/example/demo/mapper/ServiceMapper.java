package com.matrix.example.demo.mapper;


import com.matrix.example.demo.dao.entity.ServiceEntity;
import com.matrix.example.demo.model.ServiceDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ServiceMapper {
    ServiceMapper INSTANCE = Mappers.getMapper(ServiceMapper.class);

    ServiceDto serviceToDto(ServiceEntity serviceEntity);
}
