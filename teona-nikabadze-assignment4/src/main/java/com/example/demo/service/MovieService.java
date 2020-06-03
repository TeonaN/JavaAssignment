package com.example.demo.service;

import com.example.demo.dto.movie.*;

public interface MovieService {
    // პოსტების წამოღება
    GetMoviesOutput getMovies(GetMoviesInput getMoviesInput);

    // პოსტის დამატება
    AddMovieOutput addMovie(AddMovieInput addMovieInput);

    // პოსტის დეტალები
    GetMovieOutput getMovie(GetMovieInput getMovieInput);

    // პოსტის წაშლა
    DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput);
}
