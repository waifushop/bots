package com.theunitedstatesofamerica.bots.bot;

import com.theunitedstatesofamerica.bots.owner.Owner;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Bot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long discord_id;
    private String name;
    private String description;
    private String long_description;
    private String website_url;
    private String invite_url;
    private int server_count;
    private String[] prefixes;
    private String library;
    private String avatar_hash;

    @ManyToMany
    private List<Owner> owners = new ArrayList<>();
}
