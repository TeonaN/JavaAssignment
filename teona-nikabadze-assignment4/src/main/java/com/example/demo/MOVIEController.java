package com.example.demo;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MOVIEController {

    @Autowired
    MovieRepository movieRepository;


    @GetMapping("addMovie")
    public void addMovie() {

        Movie movie = new Movie();
        movie.setTitle("Movie");
        movie.setCountry("France");


        movieRepository.save(movie);
    }

    @GetMapping("getMovies")
    public void getMovies() {
        for (Movie movie : movieRepository.findAll()) {
            System.out.println(movie);
        }
    }

    @GetMapping("getMovie")
    public void getMovie() {
        Movie movie = movieRepository.getOne(1L);
        System.out.println(movie.getTitle());
        System.out.println(movie.getCountry());
    }

}
