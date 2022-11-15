package com.matrix.example.demo.controller;

import com.matrix.example.demo.service.GallaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GallaryController {
    private GallaryService gallaryService;

    public GallaryController(GallaryService gallaryService) {
        this.gallaryService = gallaryService;
    }
    @GetMapping("/gallery")
    public String home(Model model) {
        model.addAttribute("gallery", gallaryService.getGaleryParameters());
        return "gallery";
    }

}


