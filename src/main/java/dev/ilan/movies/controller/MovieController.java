package dev.ilan.movies.controller;


import dev.ilan.movies.Modal.Movie;
import dev.ilan.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
	@Autowired
	private MovieService movieService;

	@GetMapping
	public ResponseEntity<List<Movie>> allMovies() {
		List<Movie> allMovies = movieService.getAllMovies();
		return new ResponseEntity<>(allMovies, HttpStatus.OK);
	}
}
