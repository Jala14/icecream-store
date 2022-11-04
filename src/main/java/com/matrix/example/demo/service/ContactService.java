package com.matrix.example.demo.service;

import com.matrix.example.demo.dao.repository.ContactRepository;
import com.matrix.example.demo.mapper.ContactMapper;
import com.matrix.example.demo.model.ContactDto;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private ContactRepository contactRepository;
    private ContactMapper contactMapper;

    public ContactService(ContactRepository contactRepository, ContactMapper contactMapper) {
        this.contactRepository = contactRepository;
        this.contactMapper = contactMapper;
    }

    public boolean saveContact(ContactDto contactDto) {
        contactRepository.save(contactMapper.contactEntity(contactDto));
        return true;
    }
}
