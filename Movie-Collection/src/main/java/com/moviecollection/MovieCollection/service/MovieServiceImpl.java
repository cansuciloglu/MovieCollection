package com.moviecollection.MovieCollection.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviecollection.MovieCollection.model.Movie;
import com.moviecollection.MovieCollection.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovie() {
		return movieRepository.findAll();
	}

	@Override
	public void saveMovie(Movie movie) {
		this.movieRepository.save(movie);
	}

	@Override
	public Movie getMovieById(Long movie_id) {
		Optional<Movie> optional = movieRepository.findById(movie_id);
		Movie movie = null;
		if (optional.isPresent()) {
			movie = optional.get();
		} else {
			throw new RuntimeException(" Movie not found for id :: " + movie_id);
		}
		return movie;
	}

	@Override
	public void deleteMovieById(Long movie_id) {
		this.movieRepository.deleteById(movie_id);
	}

	@Override
	public List<Movie> listAll(String keyword) {
		if (keyword != null) {
			return movieRepository.search(keyword);
		}
		return movieRepository.findAll();
	}

	@Override
	public List<Movie> orderByAscending() {
		return movieRepository.orderByAscending();
	}

}
