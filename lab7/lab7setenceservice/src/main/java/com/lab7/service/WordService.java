package com.lab7.service;

import com.lab7.domain.Word;

/**
 * Created by amorales on 3/10/16.
 */
public interface WordService {

    Word getSubject();
    Word getVerb();
    Word getArticle();
    Word getAdjective();
    Word getNoun();

}
