package com.theunitedstatesofamerica.bots.owner;

import com.theunitedstatesofamerica.bots.bot.Bot;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Owner {
    @Id
    private long id;
    private String name;

    @ManyToMany
    private List<Bot> bots = new ArrayList<>();
}
