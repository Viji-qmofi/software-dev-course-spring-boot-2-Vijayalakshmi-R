package com.example.mycollections.controllers;

import com.example.mycollections.models.Album;
import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final List<Movie> movies = new ArrayList<>(){{
        add(new Movie("The Godfather", 1972, "Francis Ford Coppola", 175));
        add(new Movie("Pulp Fiction", 1994, "Quentin Tarantino",154));
        add(new Movie("Titanic", 1997, "James Cameron", 195));
    }};

    @GetMapping("/json")
    public List<Movie> getMoviesJson(){
        return movies;
    }

    @GetMapping("/html")
    public String getmoviesHtml(){
        String moviesList = "<ul>";
        for(Movie movie: movies){
            moviesList += "<li>" + movie + "</li>";
        }
        moviesList += "</ul>";
        return """
                <html>
                    <body>
                        <h1>Movies</h1>
                        <ul>
                """ +
                moviesList +
                """
                        </ul>
                    </body>
                """;
    }



}
