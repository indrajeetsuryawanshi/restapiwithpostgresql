package com.crudpostgresql.postgresql.controller;

import com.crudpostgresql.postgresql.entity.OwnerProperty;
import com.crudpostgresql.postgresql.entity.Personentity;
import com.crudpostgresql.postgresql.service.OwnerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nexus/v1/user")
public class OwnerPropertyController {
    private final OwnerService ownerService;

    public OwnerPropertyController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    @PostMapping("/addproperty")
    public ResponseEntity<OwnerProperty> saveOwnerprop(@RequestBody OwnerProperty ownerProperty){
        try{
            OwnerProperty owner=this.ownerService.saveOwnerprop(ownerProperty);

            return ResponseEntity.status(HttpStatus.OK).body(owner);

        }catch (Exception e){

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
//
    }
}
