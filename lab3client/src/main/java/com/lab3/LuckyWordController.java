package com.lab3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amorales on 29/09/16.
 */
@RestController
public class LuckyWordController {

    @Value("${lucky-word}") String luckyWord;  //You can use the @Value annotation and access the property on the application.yml file or your remote config

    @RequestMapping("/lucky-word")
    public String showLuckyWord(){
        return "The lucky word is: "  + luckyWord;
    }
}
