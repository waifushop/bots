package com.theunitedstatesofamerica.bots.owner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
    List<? extends Owner> findAllByName(String name);
}
