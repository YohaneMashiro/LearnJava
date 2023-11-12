package com.ithema.demo;

public class Film {
    private int id;
    private String name;
    private double score;
    private double price;
    private String director;
    private String actor;
    private String info;

    public Film() {
    }

    public Film(int id, String name, double score, double price, String director, String actor, String info) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.price = price;
        this.director = director;
        this.actor = actor;
        this.info = info;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
