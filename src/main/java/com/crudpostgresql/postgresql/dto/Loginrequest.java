package com.crudpostgresql.postgresql.dto;

public class Loginrequest {
     private String mobileNumber;
     public Loginrequest(String mobileNumber){
         this.mobileNumber=mobileNumber;
     }
     public String getMobileNumber(){
         return  mobileNumber;
     }

     public Loginrequest(){

     }
     public void setMobileNumber(String mobileNumber){
         this.mobileNumber=mobileNumber;
     }
}

