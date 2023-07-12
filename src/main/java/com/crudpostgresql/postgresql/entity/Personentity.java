package com.crudpostgresql.postgresql.entity;
import jakarta.persistence.*;

import java.util.Optional;

@Entity //when we use @entity annotation , we need to set primary id to one filled in table
@Table(name="userData",uniqueConstraints = @UniqueConstraint(columnNames="mobileNumber"))

public class Personentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="mobileNumber")
    private String mobileNumber;

    public Personentity( Long id,String firstName, String lastName, String mobileNumber ){
this.id=id;
this.firstName=firstName;

this.lastName=lastName;
this.mobileNumber=mobileNumber;

    }
    public Personentity(){

    }



    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;

    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getMobileNumber(){
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber=mobileNumber;

    }



}
