package com.example;

import com.example.dao.TeamDAO;
import com.example.domain.Player;
import com.example.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MicroserviceBootApplication extends SpringBootServletInitializer {

    /**
     * Se ejecuta como JAR
     */
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceBootApplication.class, args);
    }

    /**
     * Se ejecuta como WAR  -- Para despliegue en servidor de aplicaciones.
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MicroserviceBootApplication.class);
    }

    @PostConstruct
    public void init() {

        // Se Crea un Base de Datos
        Set<Player> players = new HashSet<>();
        players.add(new Player("Andres", "Guardameta"));
        players.add(new Player("Juan", "Delantero"));
        players.add(new Player("Felipe", "Delantero"));
        players.add(new Player("Carlos", "Defensa"));

        Team team1 = new Team("americanos", "Cali", players);

        Set<Player> players2 = new HashSet<>();
        players2.add(new Player("Mauricio", "Guardameta"));
        players2.add(new Player("Juan", "Delantero"));
        players2.add(new Player("Pedro", "Delantero"));
        players2.add(new Player("Carlos", "Defensa"));

        Team team2 = new Team("caleños", "Cali", players2);
        teamDao.save(team1);
        teamDao.save(team2);

    }

    @Autowired TeamDAO teamDao;

}
