package com.example;

import com.example.dao.TeamDAO;
import com.example.domain.Player;
import com.example.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by amorales on 26/09/16.
 */
//@RestController   // Cuando de usa no es requerido el ResponseBody ya que lo usa por default
@Controller
public class Controlador {

    /**
     * Ejemplo REST Clásico
     */
    @RequestMapping("/hello")
    public
    @ResponseBody
    String hiThere() {
        return "Hello World!!";
    }

    /**
     * Ejemplo REST con TymeLeaf
     */
    @RequestMapping("/hitl/{name1}")
    public String hiThere1(Map model, @PathVariable String name1) {
        model.put("name1", name1);
        return "hellotl";  // el nombre del template creado
    }

    /**
     * Ejemplo REST con JSPs
     */
    @RequestMapping("/hi/{name}")
    public String hiThere2(Map model, @PathVariable String name) {
        model.put("name", name);
        return "hello";
    }


    //Ejemplo con POJOS

    private Team team;

//    @PostConstruct
//    public void init() {
//        Set<Player> players = new HashSet<>();
//        players.add(new Player("Andres", "Guardameta"));
//        players.add(new Player("Juan", "Delantero"));
//        players.add(new Player("Felipe", "Delantero"));
//        players.add(new Player("Carlos", "Defensa"));
//
//        team = new Team("Americanos", "Cali", players);
//    }

    @RequestMapping("/getTeams")
    public
    @ResponseBody
    Team getTeam() {
        return team;
    }

    //Ejemplo con JPA

    @Autowired TeamDAO teamDao;

    @RequestMapping("/getTeamByName/{name}")
    public @ResponseBody Team getTeamByName(@PathVariable String name) {
        return teamDao.findByName(name);
    }


}
