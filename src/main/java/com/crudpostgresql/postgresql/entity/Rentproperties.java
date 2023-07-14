package com.crudpostgresql.postgresql.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "tblrent" )
public class Rentproperties {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;

        @Column(name = "rent_amount")
        private int amount;

        @Column(name = "is_rent_negotiable")
        private boolean isNegotiate;

//        @OneToOne(mappedBy = "rentproperties")
//        public Ownerproperties ownerproperties;
    }





