package com.crudpostgresql.postgresql.controller;

import com.crudpostgresql.postgresql.dto.Loginrequest;
import com.crudpostgresql.postgresql.entity.Personentity;
import com.crudpostgresql.postgresql.service.Personservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
//using requestmapping to map web request
@RequestMapping("/nexus/v1/user")
public class PersonController {
    private final Personservice personservice;
    public PersonController(Personservice personservice){
        this.personservice=personservice;
    }//this is constructor base
//    injection

    @PostMapping("/signup")
//    public String savePerson(@ModelAttribute Personentity personentity){
//        System.out.println("kmdkdk");
//    }

    public ResponseEntity<Personentity> savePerson(@RequestBody Personentity personentity){
        try{
        Personentity person=this.personservice.savePerson(personentity);

        return ResponseEntity.status(HttpStatus.OK).body(person);

        }catch (Exception e){

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
//
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Loginrequest loginRequest) {
        Personentity user = personservice.getUserByMobileNumber(loginRequest.getMobileNumber());

        // Validate the password
        if (!user.getMobileNumber().equals(loginRequest.getMobileNumber())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }

        // Perform any additional authentication or authorization logic here

        return ResponseEntity.ok("Login successful");
    }

}
