package com.matrix.example.demo.controller;


import com.matrix.example.demo.service.ServiceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {
    private ServiceService serviceService;

    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }
    @GetMapping("/service")
    public String title(Model model){
        model.addAttribute("service",serviceService.getServiceParameters());
        return "service";
    }
}
