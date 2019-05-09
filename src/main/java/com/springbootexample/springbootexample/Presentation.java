package com.springbootexample.springbootexample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Presentation {


    @Id
    @GeneratedValue
    private Integer id;

    private String topic;

    public Integer getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }
}
