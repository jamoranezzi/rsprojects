package com.lab7.service;

import com.lab7.dao.*;
import com.lab7.domain.Word.Role;
import com.lab7.domain.Word;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.ObservableResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.Observable;
import rx.Subscriber;

import java.util.concurrent.Future;

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
    @HystrixCommand(fallbackMethod="getFallbackSubject")
    public Observable<Word> getSubject() {
        return new ObservableResult<Word>() {
            @Override
            public Word invoke() {
                return new Word (subjectClient.getWord().getWord(), Role.subject);
            }
        };
    }

    @Override
    @HystrixCommand(fallbackMethod="getFallbackVerb")
    public Observable<Word> getVerb() {
        return new ObservableResult<Word>() {
            @Override
            public Word invoke() {
                return new Word (verbClient.getWord().getWord(), Role.verb);
            }
        };
    }

    @Override
    @HystrixCommand(fallbackMethod="getFallbackArticle")
    public Observable<Word> getArticle() {
        return new ObservableResult<Word>() {
            @Override
            public Word invoke() {
                return new Word (articleClient.getWord().getWord(), Role.article);
            }
        };
    }

    @Override
    @HystrixCommand(fallbackMethod="getFallbackAdjective")
    public Observable<Word> getAdjective() {
        return new ObservableResult<Word>() {
            @Override
            public Word invoke() {
                return new Word (adjectiveClient.getWord().getWord(), Role.adjective);
            }
        };
    }

    @Override
    @HystrixCommand(fallbackMethod="getFallbackNoun")
    public Observable<Word> getNoun() {
        return new ObservableResult<Word>() {
            @Override
            public Word invoke() {
                return new Word (nounClient.getWord().getWord(), Role.noun);
            }
        };
    }


    public Word getFallbackSubject() {
        return new Word("[subject]", Word.Role.subject);
    }

    public Word getFallbackVerb() {
        return new Word("[verb]", Role.verb);
    }

    public Word getFallbackArticle() {
        return new Word("[article]", Role.article);
    }

    public Word getFallbackAdjective() {
        return new Word("[adjective]", Role.adjective);
    }

    public Word getFallbackNoun() {
        return new Word("[something]", Role.noun);
    }
}
