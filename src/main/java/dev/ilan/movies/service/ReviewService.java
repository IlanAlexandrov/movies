package dev.ilan.movies.service;

import dev.ilan.movies.Modal.Movie;
import dev.ilan.movies.Modal.Review;
import dev.ilan.movies.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReviewService {

	private final ReviewRepository reviewRepository;
	private final MovieService movieService;

	private final MongoTemplate mongoTemplate;


	public Review createReview(String reviewBody, String imdbId) {
		Review review = reviewRepository.insert(new Review(reviewBody));
		mongoTemplate.update(Movie.class)
			.matching(Criteria.where("imdbId").is(imdbId))
			.apply(new Update().push("reviewIds").value(review))
			.first();
		return review;
	}

}
