package com.lab5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by amorales on 30/09/16.
 */
@Controller
public class WordController {

      @Value("${words}") String words;
//    String words = "niño,gato,perro,langostal";

    @RequestMapping("/")
    public @ResponseBody
    String getWord() {
        String[] wordArray = words.split(",");
        int i = (int)Math.round(Math.random() * (wordArray.length - 1));
        return wordArray[i];
    }

}
