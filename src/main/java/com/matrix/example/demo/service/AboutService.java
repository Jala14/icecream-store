package com.matrix.example.demo.service;


import com.matrix.example.demo.dao.repository.AboutRepository;
import com.matrix.example.demo.mapper.AboutMapper;
import com.matrix.example.demo.mapper.ProductMapper;
import com.matrix.example.demo.model.AboutDto;
import com.matrix.example.demo.model.ProductDto;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService {
    private AboutRepository aboutRepository;

    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public List<AboutDto> getAboutParametr() {
        var productEntityList = aboutRepository.findAll(
                Sort.by(Sort.Direction.DESC, "price")
        );

        return  productEntityList.parallelStream()
                .map(AboutMapper.INSTANCE::aboutToDto)
                .toList();
    }
}
