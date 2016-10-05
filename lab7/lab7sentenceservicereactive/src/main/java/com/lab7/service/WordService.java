package com.lab7.service;

import com.lab7.domain.Word;
import rx.Observable;

import java.util.concurrent.Future;

/**
 * Created by amorales on 3/10/16.
 */
public interface WordService {

    Observable<Word> getSubject();
    Observable<Word> getVerb();
    Observable<Word> getArticle();
    Observable<Word> getAdjective();
    Observable<Word> getNoun();
}
