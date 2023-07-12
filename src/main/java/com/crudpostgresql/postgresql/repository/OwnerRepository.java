package com.crudpostgresql.postgresql.repository;

import com.crudpostgresql.postgresql.dto.Owner;
import com.crudpostgresql.postgresql.entity.OwnerProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository  extends JpaRepository<OwnerProperty,Long> {
//public  OwnerProperty save(OwnerProperty ownerProperty);
}
