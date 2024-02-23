package dev.ilan.movies.service;

import dev.ilan.movies.Modal.Movie;
import dev.ilan.movies.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovieService {

	private final MovieRepository movieRepository;


	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}
}
