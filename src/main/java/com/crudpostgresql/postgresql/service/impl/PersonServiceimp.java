package com.crudpostgresql.postgresql.service.impl;

import com.crudpostgresql.postgresql.entity.Personentity;
import com.crudpostgresql.postgresql.repository.PersonRepository;
import com.crudpostgresql.postgresql.service.Personservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PersonServiceimp implements Personservice {
    //we need to call repository to use this service
    @Autowired
    private PersonRepository personRepository;
    //this filed base injection
    public PersonServiceimp(PersonRepository personRepository){
        super();
        this.personRepository=personRepository;
    }
    @Override
    public Personentity savePerson(Personentity personentity){
        return personRepository.save(personentity);
    }
    @Override
    public Personentity getUserByMobileNumber(String mobileNumber) {
        return personRepository.findByMobileNumber(mobileNumber);
//                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

}
