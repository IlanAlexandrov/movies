package dev.ilan.movies.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@GetMapping("/movies")
	public String apiRoot(){
		return "Welcome to the movies API!";
	}
}
