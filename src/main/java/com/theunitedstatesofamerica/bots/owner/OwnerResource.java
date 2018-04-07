package com.theunitedstatesofamerica.bots.owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@Component
public class OwnerResource {

    @Autowired private OwnerService ownerService;

    @RequestMapping(value = "/owners", method = RequestMethod.GET)
    public List<Owner> findAll() {
        List<Owner> entities;
        entities = ownerService.findAll();
        return entities;
    }

    @RequestMapping(value = "/owners", method = RequestMethod.POST)
    public Owner add(@RequestBody @Valid Owner owner) {
        return ownerService.add(owner);
    }

    @RequestMapping(value = "/owners/{id}", method = RequestMethod.PUT)
    public Owner update(Owner owner) {
        return ownerService.update(owner);
    }
}
