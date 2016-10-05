package com.lab7.domain;

/**
 * Created by amorales on 3/10/16.
 */
public class Word {

    private String word;
    private Role role;

    public Word(String word, Role role) {
        this(word);
        this.role = role;
    }

    public Word(String word ) {
        this();
        this.word = word;
    }

    public Word() {
        super();
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getString() {
        return getWord();
    }

    public static enum Role {
        subject,verb,article,adjective,noun;
    }

}
