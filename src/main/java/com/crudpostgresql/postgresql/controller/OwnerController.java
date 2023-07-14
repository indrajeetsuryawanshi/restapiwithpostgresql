package com.crudpostgresql.postgresql.controller;

import com.crudpostgresql.postgresql.entity.Ownerproperties;
import com.crudpostgresql.postgresql.repository.OwnerPropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {
    @Autowired
    private OwnerPropertyRepository ownerPropertyRepository;
    @PostMapping("/addproperty")
    public ResponseEntity <String > saveProp(@RequestBody Ownerproperties ownerproperties){
        ownerPropertyRepository.save(ownerproperties);
        return ResponseEntity.ok("savce");
    }


}
