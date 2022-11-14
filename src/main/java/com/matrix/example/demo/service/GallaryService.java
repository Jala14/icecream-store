package com.matrix.example.demo.service;

import com.matrix.example.demo.dao.entity.GallaryEntity;
import com.matrix.example.demo.dao.repository.GallaryRepository;
import com.matrix.example.demo.enums.IceCreamCategory;
import com.matrix.example.demo.mapper.GallaryMapper;
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
    public List<GallaryEntity>findAll(){
     return gallaryRepository.findAll();
    }

    public GallaryEntity findById(Integer id) {
        return gallaryRepository.findById(id).get();
    }

    public List<GallaryDto> getIceCreamParametr() {
        return gallaryRepository.findAll()
                .stream()
                .map(GallaryMapper.INSTANCE::gallaryDto)
                .collect(Collectors.toList());
    }

    public GallaryEntity getIceCreamParametr(Integer id) {
        return gallaryRepository.findById(id).get();
    }

    public List<GallaryEntity> getIceCreamCone() {
        List<GallaryEntity> showIceCreamCone =
                gallaryRepository.showIceCreamCone();
        return showIceCreamCone;
    }

    public List<GallaryEntity> getIceCreamVanilla() {
        List<GallaryEntity> showIceCreamVanilla =
                gallaryRepository.showIceCreamVanilla();
        return showIceCreamVanilla;
    }

    public List<GallaryEntity> getIceCreamChocolate() {
        List<GallaryEntity> showIceCreamChocolate =
                gallaryRepository.showIceCreamChocolate();
        return showIceCreamChocolate;
    }

    public List<GallaryEntity> getByCategoryCone() {
        List<GallaryEntity> byCategoryCone =
                gallaryRepository.findByCategoryCone(IceCreamCategory.Cone);
        return byCategoryCone;
    }
    public List<GallaryEntity> getByCategoryVanilla() {
        List<GallaryEntity> byCategoryVanilla =
                gallaryRepository.findByCategoryVanilla(IceCreamCategory.Vanilla);
        return byCategoryVanilla;
    }

    public List<GallaryEntity> getByCategoryChocolate() {
        List<GallaryEntity> byCategoryChocolate =
                gallaryRepository.findByCategoryChocolate(IceCreamCategory.Chocolate);
        return byCategoryChocolate;
    }

    public void saveProduct(GallaryEntity gallaryEntity) {
        gallaryRepository.save(gallaryEntity);
    }

    public void deleteProduct(Integer id) {
        gallaryRepository.deleteById(id);
    }
}
