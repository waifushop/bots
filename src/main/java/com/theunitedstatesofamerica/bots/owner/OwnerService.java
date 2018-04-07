package com.theunitedstatesofamerica.bots.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.WebApplicationException;
import java.util.List;

@Service
public class OwnerService {
    @Autowired OwnerRepository ownerRepository;

    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }

    public Owner add(Owner owner) {
        return ownerRepository.save(owner);
    }

    public Owner update(Owner owner) {
        if(ownerRepository.exists(owner.getId())) {
            return ownerRepository.save(owner);
        } else {
            throw new WebApplicationException();
        }
    }
}
