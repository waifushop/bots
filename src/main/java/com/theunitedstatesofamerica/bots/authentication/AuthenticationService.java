package com.theunitedstatesofamerica.bots.authentication;

import com.theunitedstatesofamerica.bots.authentication.commons.ExchangeBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class AuthenticationService {
    private ArrayList<String> tokens = new ArrayList<>();

    public boolean exists(String token) {
        return tokens.contains(token);
    }

    protected String generateNewToken() {
        String token = UUID.randomUUID().toString();
        tokens.add(token);
        return token;
    }

    public boolean exchange(ExchangeBody body) {
        if(exists(body.state)) {
            return tokens.remove(body.state);
        } else {
            return false;
        }
    }

    public Dick exchangeRequest() {
        OkHttpClient cuck = new OkHttpClient.Builder().build();
        Request request = new Request.Builder();
        now what?
    }
}
