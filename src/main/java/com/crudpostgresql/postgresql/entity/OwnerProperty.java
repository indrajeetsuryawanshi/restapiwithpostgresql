package com.crudpostgresql.postgresql.entity;
import com.crudpostgresql.postgresql.dto.Owner;
import com.crudpostgresql.postgresql.dto.Rent;
import com.crudpostgresql.postgresql.dto.SecurityDeposit;
import jakarta.persistence.*;

import java.time.format.DecimalStyle;
import java.util.Date;
@Entity //when we use @entity annotation , we need to set primary id to one filled in table
@Table(name="owner_properties")

public class OwnerProperty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownerid;


    @Column(name ="propertyType")
        private String propertyType;
    @Column(name ="city")

    private String city;
    @Column(name ="locality")

    private String locality;
    @Column(name ="roomType")

    private String roomType;
    @Column(name ="furnishStatus")

    private String furnishStatus;
    @Column(name ="preferred")

    private String preferred;
//    @Column(name ="rent")
//
//    private Rent rent;
//    @Column(name ="securityDeposit")
//
//    private SecurityDeposit securityDeposit;
//    @Column(name ="owner")
//
//    private Owner owner;
    @Column(name ="foodPreference")

    private String foodPreference;
    @Column(name ="availability")

    private String availability;
    @Column(name ="attachmentId")

    private String attachmentId;
    @Column(name ="totalFloor")

    private int totalFloor;
    @Column(name ="locatedFloor")

    private int locatedFloor;
    @Column(name ="society")

    private String society;
    @Column(name ="postedOn")

    private String postedOn;



    public OwnerProperty(Long ownerid,String propertyType, String city, String locality,String roomType,String furnishStatus,String preferred,String foodPreference,String availability, String attachmentId,int totalFloor,int locatedFloor,String society,String postedOn){
        this.ownerid=ownerid;
        this.propertyType=propertyType;

        this.city=city;
        this.locality=locality;
        this.roomType=roomType;
        this.furnishStatus=furnishStatus;
        this.preferred=preferred;
        this.foodPreference=foodPreference;
        this.availability=availability;
        this.attachmentId=attachmentId;
        this.totalFloor=totalFloor;
        this.locatedFloor=locatedFloor;
        this.society=society;
        this.postedOn=postedOn;


    }
    // Constructor, getters, and setters

        public OwnerProperty() {

        }

        // Getter and Setter methods

        public String getPropertyType() {
            return propertyType;
        }

        public void setPropertyType(String propertyType) {
            this.propertyType = propertyType;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getLocality() {
            return locality;
        }

        public void setLocality(String locality) {
            this.locality = locality;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public String getFurnishStatus() {
            return furnishStatus;
        }

        public void setFurnishStatus(String furnishStatus) {
            this.furnishStatus = furnishStatus;
        }

        public String getPreferred() {
            return preferred;
        }

        public void setPreferred(String preferred) {
            this.preferred = preferred;
        }

//        public Rent getRent() {
//            return rent;
//        }
//
//        public void setRent(Rent rent) {
//            this.rent = rent;
//        }
//
//        public SecurityDeposit getSecurityDeposit() {
//            return securityDeposit;
//        }
//
//        public void setSecurityDeposit(SecurityDeposit securityDeposit) {
//            this.securityDeposit = securityDeposit;
//        }
//
//        public Owner getOwner() {
//            return owner;
//        }
//
//        public void setOwner(Owner owner) {
//            this.owner = owner;
//        }

        public String getFoodPreference() {
            return foodPreference;
        }

        public void setFoodPreference(String foodPreference) {
            this.foodPreference = foodPreference;
        }

        public String getAvailability() {
            return availability;
        }

        public void setAvailability(String availability) {
            this.availability = availability;
        }

        public String getAttachmentId() {
            return attachmentId;
        }

        public void setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
        }

        public int getTotalFloor() {
            return totalFloor;
        }

        public void setTotalFloor(int totalFloor) {
            this.totalFloor = totalFloor;
        }

        public int getLocatedFloor() {
            return locatedFloor;
        }

        public void setLocatedFloor(int locatedFloor) {
            this.locatedFloor = locatedFloor;
        }

        public String getSociety() {
            return society;
        }

        public void setSociety(String society) {
            this.society = society;
        }

        public String  getPostedOn() {
            return postedOn;
        }

        public void setPostedOn(String postedOn) {
            this.postedOn = postedOn;
        }


//    public OwnerProperty save(OwnerProperty ownerProperty) {
//            return null;
//    }
}


