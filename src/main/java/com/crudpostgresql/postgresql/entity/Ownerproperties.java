package com.crudpostgresql.postgresql.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Transactional
@Data
   @Getter
    @Setter
    @Entity
    @Table(name = "tblproperties" )
    @NoArgsConstructor
    public class Ownerproperties {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "Ownerprop_id")
        private Long id;

        @Column(name = "property_type")
        private String propertyType;

        @Column(name = "city")
        private String city;

        @Column(name = "locality")
        private String locality;

        @Column(name = "room_type")
        private String roomType;

        @Column(name = "furnish_status")
        private String furnishStatus;

        @Column(name = "preferred")
        private String preferred;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="fk_rentproperties_id")
        private Rentproperties rentproperties;


    }




