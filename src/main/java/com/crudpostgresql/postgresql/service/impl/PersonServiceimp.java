package com.crudpostgresql.postgresql.service.impl;

import com.crudpostgresql.postgresql.entity.Personentity;
import com.crudpostgresql.postgresql.repository.PersonRepository;
import com.crudpostgresql.postgresql.service.Personservice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceimp implements Personservice {
    //we need to call repository to use this service
    private final PersonRepository personRepository;
    public PersonServiceimp(PersonRepository personRepository){
        this.personRepository=personRepository;
    }
    @Override
    public List<Personentity> findAllPerson() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Personentity> findById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public Personentity savePerson(Personentity personentity) {
        return personRepository.save(personentity);
    }

    @Override
    public Personentity updatePerson(Personentity personentity) {
        return personRepository.save(personentity);
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.deleteById(id);

    }
}
