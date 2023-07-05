package com.crudpostgresql.postgresql.controller;

import com.crudpostgresql.postgresql.entity.Personentity;
import com.crudpostgresql.postgresql.service.Personservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.PropertyPermission;

@RestController
//using requestmapping to map web request
@RequestMapping("/person")
public class PersonController {
    private final Personservice personservice;
    public PersonController(Personservice personservice){
        this.personservice=personservice;
    }
    @GetMapping
    public List<Personentity> findAllPerson(){
      return  this.personservice.findAllPerson();
    }
    @GetMapping("/{id}")
    public Optional<Personentity> findById(@PathVariable("id") Long id){
        return personservice.findById(id);
    }
    @PostMapping
    public Personentity savePerson(@RequestBody Personentity personentity){
        return personservice.savePerson(personentity);
    }
    @PutMapping
    public Personentity updatePerson(@RequestBody Personentity personentity){
        return personservice.updatePerson(personentity);
    }
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable("id") Long id){
        personservice.deletePerson(id);
    }

}
