package org.project.spring.best_of_the_year.classes;

public class Song {
    private String id;
    private String titolo;

    public Song(String id, String titolo){
        this.id = id;
        this.titolo = titolo;
    }

    public String getId(){
        return this.id;
    }

    public String getTitolo(){
        return this.titolo;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
}
