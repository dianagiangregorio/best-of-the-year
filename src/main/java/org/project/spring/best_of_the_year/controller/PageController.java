package org.project.spring.best_of_the_year.controller;

import java.util.ArrayList;
import java.util.List;

import org.project.spring.best_of_the_year.classes.Movie;
import org.project.spring.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller 
@RequestMapping("/")
public class PageController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);
        return "welcome";
    }

    private List<Movie> getBestMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("1122", "UNA VIAGGIATRICE A SEOUL"));
        movies.add(new Movie("2211", "UNA BARCA IN GIARDINO"));
        movies.add(new Movie("3322", "THE BRUTALIST"));
        return movies;
    }

    private List<Song> getBestSongs(){
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("1","ROOFTOP"));
        songs.add(new Song("2", "Capri Sun"));
        songs.add(new Song("3", "5 gocce"));
        return songs;
    }
    
    @GetMapping("/movies")
    public String movies(Model model){
        List<Movie> movies = getBestMovies();
        model.addAttribute("movies", movies);
        return "movies";
    } 

    @GetMapping("/songs")
    public String songs(Model model){
        List<Song> songs = getBestSongs();
        model.addAttribute("songs", songs);
        return "songs";
    }
}
