package com.lab9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by amorales on 20/10/16.
 */
@Controller
public class SentenceController {

    @RequestMapping("/")
    public String sentence() {
        return "sentence";
    }
}