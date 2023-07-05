package com.crudpostgresql.postgresql.service;

import com.crudpostgresql.postgresql.entity.Personentity;

import java.util.List;
import java.util.Optional;

//we can create an interfce which contains get, save,update and delete methods using the code
public interface Personservice {
    List<Personentity> findAllPerson();
    Optional<Personentity> findById(Long id);
    Personentity savePerson(Personentity personentity);
    Personentity updatePerson(Personentity personentity);
    void deletePerson(Long id);


}
