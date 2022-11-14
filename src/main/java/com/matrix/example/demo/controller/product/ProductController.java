package com.matrix.example.demo.controller.product;

import com.matrix.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
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
        model.addAttribute("indexProducts", productService.getProducts());

        return "index";
    }
}
