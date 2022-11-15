package com.matrix.example.demo.service;


import com.matrix.example.demo.dao.repository.AboutRepository;
import com.matrix.example.demo.mapper.AboutMapper;
import com.matrix.example.demo.model.AboutDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService {
    private AboutRepository aboutRepository;

    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public List<AboutDto> getAboutParameters() {
        var productEntityList = aboutRepository.findAll();

        return  productEntityList.parallelStream()
                .map(AboutMapper.INSTANCE::aboutToDto)
                .toList();
    }
}
