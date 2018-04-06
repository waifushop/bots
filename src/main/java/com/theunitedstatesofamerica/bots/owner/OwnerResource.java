package com.theunitedstatesofamerica.bots.owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
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
}
