package com.lab6.dao;

import org.springframework.stereotype.Component;

/**
 * Created by amorales on 3/10/16.
 */
@Component("articleService")
public class ArticleDaoImpl extends WordDaoImpl {

    @Override
    public String getPartOfSpeech() {
        return ARTICLE;
    }


}