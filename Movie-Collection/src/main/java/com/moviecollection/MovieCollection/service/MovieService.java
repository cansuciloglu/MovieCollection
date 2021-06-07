package com.moviecollection.MovieCollection.service;

import java.util.List;

import com.moviecollection.MovieCollection.model.Movie;

public interface MovieService {
	List<Movie> getAllMovie();

	void saveMovie(Movie movie);

	Movie getMovieById(Long movie_id);

	void deleteMovieById(Long movie_id);

	List<Movie> listAll(String keyword);

	public List<Movie> orderByAscending();

}
