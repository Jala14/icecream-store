package com.matrix.example.demo.mapper;

import com.matrix.example.demo.dao.entity.ContactEntity;
import com.matrix.example.demo.model.ContactDto;

import org.springframework.stereotype.Component;

@Component
public class ContactMapper {

    public ContactEntity contactEntityDto(ContactDto contactDto) {
        return new ContactEntity(

                contactDto.getName(),
                contactDto.getEmail(),
                contactDto.getSubject(),
                contactDto.getMessage()
        );
    }
}
