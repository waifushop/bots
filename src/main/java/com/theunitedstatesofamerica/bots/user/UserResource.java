package com.theunitedstatesofamerica.bots.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
@Component
public class UserResource {
    @Autowired UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> findAll() {
        List<User> entities;
        entities = userService.findAll();
        return entities;
    }
}
