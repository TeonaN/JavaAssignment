package com.example.demo.service.impl;

import com.example.demo.dto.movie.*;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;


    @Override
    public GetMoviesOutput getMovies(GetMoviesInput getMoviesInput) {

        List<MovieDTO> movieDTOList = new ArrayList<>();
        for (Movie movie : movieRepository.findAll()) {
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setId(movie.getId());
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());

        }

        GetMoviesOutput getMoviesOutput = new GetMoviesOutput();
        getMoviesOutput.setMovies(movieDTOList);
        return getMoviesOutput;
    }

    @Override
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());


        movieRepository.save(movie);

        AddMovieOutput addMovieOutput = new AddMovieOutput();
        addMovieOutput.setMsg("ფილმი დაემატა");
        return addMovieOutput;
    }

    @Override
    public GetMovieOutput getMovie(GetMovieInput getMovieInput) {
        Movie movie = movieRepository.getOne(getMovieInput.getMovieId());

        GetMovieOutput getMovieOutput = new GetMovieOutput();
        getMovieOutput.setTitle(movie.getTitle());
        getMovieOutput.setCountry(movie.getCountry());



        return getMovieOutput;
    }

    @Override
    public DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput) {
        Movie movie = movieRepository.getOne(deleteMovieInput.getMovieId());
        movieRepository.delete(movie);

        DeleteMovieOutput deleteMovieOutput = new DeleteMovieOutput();
        deleteMovieOutput.setMsg("ფილმი წარმატებით წაიშალა");
        return deleteMovieOutput;
    }
}
