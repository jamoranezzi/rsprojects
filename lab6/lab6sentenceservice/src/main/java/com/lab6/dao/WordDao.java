package com.lab6.dao;

import com.lab6.domain.Word;

/**
 * Created by amorales on 3/10/16.
 */
public interface WordDao {

    static final String SUBJECT = "SUBJECT";
    static final String VERB = "VERB";
    static final String ARTICLE = "ARTICLE";
    static final String ADJECTIVE = "ADJECTIVE";
    static final String NOUN = "NOUN";

    Word getWord();

}
