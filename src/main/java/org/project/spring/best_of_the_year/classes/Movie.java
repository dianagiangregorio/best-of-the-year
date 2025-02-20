package org.project.spring.best_of_the_year.classes;

import java.io.Serializable;

public class Movie implements Serializable {
    private String movieId;
    private String movieTitolo;

    public Movie(String movieId, String movieTitolo){
        this.movieId = movieId;
        this.movieTitolo = movieTitolo;
    }

    public String getId(){
        return this.movieId;
    }

    public String getTitolo(){
        return this.movieTitolo;
    }

    public void setId(String movieId){
        this.movieId = movieId;
    }

    public void setTitolo(String movieTitolo){
        this.movieTitolo = movieTitolo;
    }

    @Override
    public String toString(){
        return "Movie ID: " + this.movieId + "Movie name: " + this.movieTitolo;
    }
}
