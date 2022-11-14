package com.matrix.example.demo.controller;


import com.matrix.example.demo.model.ContactDto;
import com.matrix.example.demo.service.ContactService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;


    public ContactController(ContactService contactService) {
        this.contactService = contactService;

    }

    @PostMapping("/")
    public void saveContact(@RequestBody ContactDto contactDto) {
        contactService.saveContact(contactDto);
    }


}
