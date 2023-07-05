package com.crudpostgresql.postgresql.repository;

import com.crudpostgresql.postgresql.entity.Personentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //for confirm it is repository
//we need to extends jparepository for using jpa repository
//repository have two params 1)entity and 2)datatype of primary key
public interface  PersonRepository extends JpaRepository<Personentity,Long> {
}
