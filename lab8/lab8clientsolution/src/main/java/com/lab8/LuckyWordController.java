package com.lab8;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amorales on 10/10/16.
 */
@RestController
public class LuckyWordController {
    String luckyWord;
    String preamble;

    @RequestMapping("/lucky-word")
    public String showLuckyWord() {
        return preamble + ": " + luckyWord;
    }

    public String getLuckyWord() {
        return luckyWord;
    }

    public void setLuckyWord(String luckyWord) {
        this.luckyWord = luckyWord;
    }

    public String getPreamble() {
        return preamble;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }
}
