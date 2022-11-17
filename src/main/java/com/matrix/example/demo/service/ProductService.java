package com.matrix.example.demo.service;

import com.matrix.example.demo.dao.entity.ProductEntity;
import com.matrix.example.demo.dao.repository.ProductRepository;
import com.matrix.example.demo.mapper.ProductMapper;
import com.matrix.example.demo.model.ProductDto;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> getProducts() {
        var productEntityList = productRepository.findAll(
                Sort.by(Sort.Direction.DESC, "price")
        );

        return productEntityList.parallelStream()
                .map(ProductMapper.INSTANCE::mapToDto)
                .toList();
    }


    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }
    public ProductEntity findById(Integer id) {
        return productRepository.findById(id).get();
    }
    public List<ProductDto> getProductParametr() {
        return productRepository.findAll()
                .stream()
                .map(ProductMapper.INSTANCE::mapToDto)
                .collect(Collectors.toList());
    }

    public ProductEntity getProductParametr(Integer id) {
        return productRepository.findById(id).get();
    }
    public void saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }



}
