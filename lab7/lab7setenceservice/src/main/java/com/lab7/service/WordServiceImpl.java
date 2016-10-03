package com.lab7.service;

import com.lab7.dao.*;
import com.lab7.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by amorales on 3/10/16.
 */
@Service
public class WordServiceImpl implements WordService {

    @Autowired VerbClient verbClient;
    @Autowired SubjectClient subjectClient;
    @Autowired ArticleClient articleClient;
    @Autowired AdjectiveClient adjectiveClient;
    @Autowired NounClient nounClient;


    @Override
    public Word getSubject() {
        return subjectClient.getWord();
    }

    @Override
    public Word getVerb() {
        return verbClient.getWord();
    }

    @Override
    public Word getArticle() {
        return articleClient.getWord();
    }

    @Override
    public Word getAdjective() {
        return adjectiveClient.getWord();
    }

    @Override
    public Word getNoun() {
        return nounClient.getWord();
    }
}
