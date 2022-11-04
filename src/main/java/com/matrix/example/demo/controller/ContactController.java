package com.matrix.example.demo.controller;


import com.matrix.example.demo.model.ContactDto;
import com.matrix.example.demo.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/savecontact")
    public  String saveContact(Model model){
        return "contact";
    }

    @PostMapping("/savecontact")
    public void saveContact(@RequestBody ContactDto contactDto) {
        contactService.saveContact(contactDto);
    }

}
