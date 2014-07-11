package ru.arthur.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by salimhanov on 11.07.2014.
 */


@Entity
public class Article {
    private String id;
    private String name;
    private String date;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

        public String getId(){
             return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
