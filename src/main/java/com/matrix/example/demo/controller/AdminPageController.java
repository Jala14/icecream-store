package com.matrix.example.demo.controller;


import com.matrix.example.demo.dao.entity.ProductEntity;
import com.matrix.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminPageController {
    private ProductService productService;

    @Autowired
    public AdminPageController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping({"", "/"})
    public String findAll(Model model) {
        List<ProductEntity> productEntityList = productService.findAll();
        model.addAttribute("product", productEntityList);
        return "adminPage";
    }

    @GetMapping("/addproduct")
    public String addProduct() {
        return "addProduct";
    }

    @GetMapping("/editProduct/{id}")
    public String editProduct(@PathVariable Integer id, Model model) {
        ProductEntity productEntity = productService.getProductParametr(id);
        model.addAttribute("product", productEntity);

        return "editProduct";
    }


    @PostMapping("/saveProduct")
    public String saveProduct(ProductEntity productEntity) {
        productService.saveProduct(productEntity);
        return "redirect:/admin";

    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return "redirect:/admin";
    }

}
