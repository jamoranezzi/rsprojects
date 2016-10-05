package com.lab7;

import com.lab7.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by amorales on 30/09/16.
 */
@Controller
public class SentenceController {

    @Autowired
    SentenceService sentenceService;


    /**
     * Display a small list of Sentences to the caller:
     */
    @RequestMapping("/sentence")
    public @ResponseBody String getSentences() {
        return
                "<h3>Some Sentences</h3><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>"
                ;
    }
}
