package com.crudpostgresql.postgresql.entity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity //when we use @entity annotation , we need to set primary id to one filled in table
@Table(name="mt_person")
//@NoArgsConstructor
//public class Cliente{
//
//}
public class Personentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ps_id")
    private Long id;
    @Column(name ="ps_name")
    private String name;
    @Column(name="ps_gender")
    private String gender;
    @Column(name="ps_dob")
    private Date dob;
    @Column(name="ps_address")
    private String address;

    public Personentity(Long id,String name,String gender,Date dob,String address ){
this.id=id;
this.name=name;
this.gender=gender;
this.dob=dob;
this.address=address;
    }
    public Personentity(){

    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public Date getDob(){
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;

    }


}
