package com.crudpostgresql.postgresql.repository;

import com.crudpostgresql.postgresql.entity.Ownerproperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerPropertyRepository extends JpaRepository<Ownerproperties,Long> {
}
