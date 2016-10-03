package com.lab7.dao;

import com.lab7.domain.Word;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by amorales on 3/10/16.
 */
@FeignClient("SUBJECT")
public interface SubjectClient {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public Word getWord();

}