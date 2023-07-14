package com.crudpostgresql.postgresql.repository;

import com.crudpostgresql.postgresql.entity.Rentproperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentPropertyRepository  extends JpaRepository<Rentproperties ,Long> {

}
