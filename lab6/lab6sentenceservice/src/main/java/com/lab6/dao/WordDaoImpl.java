package com.lab6.dao;

import com.lab6.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.client.RestTemplate;

/**
 * Created by amorales on 3/10/16.
 */
public abstract class WordDaoImpl implements WordDao {

    @Autowired
    LoadBalancerClient loadBalancer;

    public abstract String getPartOfSpeech();

    public Word getWord() {
        ServiceInstance instance = loadBalancer.choose(getPartOfSpeech());
        return (new RestTemplate()).getForObject(instance.getUri(),Word.class);
    }

}


