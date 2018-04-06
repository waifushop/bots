package com.theunitedstatesofamerica.bots.owner;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
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
