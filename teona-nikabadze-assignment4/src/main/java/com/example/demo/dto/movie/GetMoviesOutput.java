package com.example.demo.dto.movie;

import lombok.Data;

import java.util.List;

@Data
public class GetMoviesOutput {
    private List<MovieDTO> movies;
}
