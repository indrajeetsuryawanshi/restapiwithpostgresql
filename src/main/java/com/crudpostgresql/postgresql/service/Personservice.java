package com.crudpostgresql.postgresql.service;

import com.crudpostgresql.postgresql.entity.Personentity;

import java.util.Optional;

//we can create an interfce which contains get, save,update and delete methods using the code
public interface Personservice {
public  Personentity savePerson(Personentity personentity);
    public Personentity getUserByMobileNumber(String mobileNumber) ;




}
