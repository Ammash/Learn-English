package com.words.english.english100;

import java.io.Serializable;

public class Post implements Serializable {
    private String title ;
    private String descriprion;
    private String count;
    private String speak;

    public Post(String title, String descriprion , String count, String speak) {
        this.title = title;
        this.descriprion = descriprion;
        this.count =count;
        this.speak =speak;
    }
    public Post(String title, String descriprion, String speak) {
        this.title = title;
        this.descriprion = descriprion;
        this.speak =speak;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String descriprion) {
        this.speak = speak;
    }
}
