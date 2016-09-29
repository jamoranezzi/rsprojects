package com.example.dao;

import com.example.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by amorales on 28/09/16.
 */
@RestResource(path="players" , rel="player")
public interface PlayerDAO extends CrudRepository<Player, Long> {
}
