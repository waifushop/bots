package com.theunitedstatesofamerica.bots.authentication;

import com.theunitedstatesofamerica.bots.authentication.commons.DiscordRequestBody;
import com.theunitedstatesofamerica.bots.authentication.commons.ExchangeBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.NotAuthorizedException;

import static javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED;

@RestController
@CrossOrigin
@RequestMapping("/api/auth")
public class AuthenticationResource {
    @Autowired Environment env;
    @Autowired AuthenticationService authenticationService;

    @RequestMapping("/token")
    public String getToken() {
        return authenticationService.generateNewToken();
    }

    @RequestMapping("/exchange")
    public boolean exchange(@RequestBody ExchangeBody body) {
        if(authenticationService.exchange(body)) {
            RestTemplate restTemplate = new RestTemplate();



            System.out.println(test);
            return true;
        } else {
            throw new NotAuthorizedException("Not authorized");
        }
    }
}
