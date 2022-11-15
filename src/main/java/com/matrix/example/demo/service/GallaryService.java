package com.matrix.example.demo.service;

import com.matrix.example.demo.dao.entity.GallaryEntity;
import com.matrix.example.demo.dao.repository.GallaryRepository;
import com.matrix.example.demo.mapper.AboutMapper;
import com.matrix.example.demo.mapper.GallaryMapper;
import com.matrix.example.demo.model.AboutDto;
import com.matrix.example.demo.model.GallaryDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GallaryService {
    private GallaryRepository gallaryRepository;

    public GallaryService(GallaryRepository gallaryRepository) {
        this.gallaryRepository = gallaryRepository;
    }

    public List<GallaryDto> getGaleryParameters() {
        var productEntityList = gallaryRepository.findAll();

        return  productEntityList.parallelStream()
                .map(GallaryMapper.INSTANCE::gallaryDto)
                .toList();
    }

}
