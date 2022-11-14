package com.matrix.example.demo.controller;


import com.matrix.example.demo.enums.IceCreamCategory;
import com.matrix.example.demo.service.GallaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GallaryController {
    private GallaryService gallaryService;

    public GallaryController(GallaryService gallaryService) {
        this.gallaryService = gallaryService;
    }
    @GetMapping("/gallery")
    public String home(Model model) {
        model.addAttribute("coneparametr", gallaryService.getByCategoryCone());
        model.addAttribute("vanillaparametr", gallaryService.getByCategoryVanilla());
        model.addAttribute("chocolateparametr", gallaryService.getByCategoryChocolate());

        model.addAttribute("showcone", gallaryService.getIceCreamCone());
        model.addAttribute("showmen", gallaryService.getIceCreamVanilla());
        model.addAttribute("showacc", gallaryService.getIceCreamChocolate());
        return "gallery";
    }

}


