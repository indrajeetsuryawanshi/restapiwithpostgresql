package com.crudpostgresql.postgresql.service.impl;

import com.crudpostgresql.postgresql.entity.OwnerProperty;
import com.crudpostgresql.postgresql.repository.OwnerRepository;
import com.crudpostgresql.postgresql.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceimpl  implements OwnerService {

    @Autowired
    private  final OwnerRepository ownerRepository;

    public OwnerServiceimpl(OwnerRepository ownerRepository) {
        super();
        this.ownerRepository = ownerRepository;
    }

    @Override
    public OwnerProperty saveOwnerprop(OwnerProperty ownerProperty) {
        return  ownerRepository.save(ownerProperty);
    }
}
