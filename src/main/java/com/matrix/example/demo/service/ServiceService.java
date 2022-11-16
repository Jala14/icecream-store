package com.matrix.example.demo.service;

import com.matrix.example.demo.dao.repository.ServiceRepository;
import com.matrix.example.demo.mapper.AboutMapper;
import com.matrix.example.demo.mapper.ServiceMapper;
import com.matrix.example.demo.model.AboutDto;
import com.matrix.example.demo.model.ProductDto;
import com.matrix.example.demo.model.ServiceDto;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    private ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    public List<ServiceDto> getServiceParameters() {
        var productEntityList = serviceRepository.findAll();

        return  productEntityList.parallelStream()
                .map(ServiceMapper.INSTANCE::serviceToDto)
                .toList();
    }
    public List<ServiceDto> getServiceParameter() {
        var productEntityList = serviceRepository.findAll();

        return  productEntityList.parallelStream()
                .map(ServiceMapper.INSTANCE::serviceToDto)
                .toList();
    }
}
