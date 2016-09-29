package com.example.dao;

import com.example.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by amorales on 27/09/16.
 */
@RestResource(path="teams" , rel="team")
public interface TeamDAO extends CrudRepository<Team, Long> {

    List<Team> findAll();

    Team findByName(String name);

}
