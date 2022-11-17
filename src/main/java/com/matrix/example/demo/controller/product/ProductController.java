package com.matrix.example.demo.controller.product;

import com.matrix.example.demo.dao.entity.ProductEntity;
import com.matrix.example.demo.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {
    private final AboutService aboutService;
    private final ProductService productService;
    private final ServiceService serviceService;
    private final GallaryService gallaryService;


    public ProductController(AboutService aboutService, ProductService productService, ServiceService serviceService,GallaryService gallaryService) {
        this.aboutService = aboutService;
        this.productService = productService;
        this.serviceService = serviceService;
        this.gallaryService=gallaryService;

    }


    @GetMapping("/products")
    public String showProducts(Model model) {
        model.addAttribute("products", productService.getProducts());

        return "product";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";

    }
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("products", productService.getProducts());
        model.addAttribute("parameter", aboutService.getAboutParameters());
        model.addAttribute("service",serviceService.getServiceParameters());
        model.addAttribute("gallery",gallaryService.getGaleryParameters());


        return "index";
    }

    @GetMapping("/productSingle/{id}")
    String findById(@PathVariable Integer id,Model model){
        model.addAttribute("productSingle",productService.findById(id));

        return "product-single";
    }

    @GetMapping("/productSingle")
    String findById(Model model){
//        model.addAttribute("productSingle",productService.findById(id));

        return "product-single";
    }
}
