package dev.ilan.movies.repository;


import dev.ilan.movies.Modal.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {

	Optional<Movie> findMovieByImdbId(String imdbId);


}
