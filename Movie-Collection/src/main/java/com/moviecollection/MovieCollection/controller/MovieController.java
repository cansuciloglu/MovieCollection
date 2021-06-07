package com.moviecollection.MovieCollection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.moviecollection.MovieCollection.model.Movie;
import com.moviecollection.MovieCollection.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/")
	public String viewHomePage(Model model, @Param("keyword") String keyword) {
		model.addAttribute("listMovie", movieService.getAllMovie());
		List<Movie> listMovie = movieService.listAll(keyword);

		model.addAttribute("listMovie", listMovie);
		model.addAttribute("keyword", keyword);

		return "index";

	}

	@GetMapping("/sortByYear")
	public String sortByYear(Model model) {
		// create model attribute to bind form data
		model.addAttribute("listMovie", movieService.orderByAscending());

		return "index";
	}

	@GetMapping("/showNewMovieForm")
	public String showNewMovieForm(Model model) {
		// create model attribute to bind form data
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "new_movie";
	}

	@PostMapping("/saveMovie")
	public String saveMovie(@ModelAttribute("movie") Movie movie) {
		// save movie to database
		movieService.saveMovie(movie);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{movie_id}")
	public String showFormForUpdate(@PathVariable(value = "movie_id") long movie_id, Model model) {

		// get movie from the service
		Movie movie = movieService.getMovieById(movie_id);

		// set movie as a model attribute to pre-populate the form
		model.addAttribute("movie", movie);
		return "update_movie";
	}

	@GetMapping("/showFormForView/{movie_id}")
	public String showFormForView(@PathVariable(value = "movie_id") long movie_id, Model model) {

		// get movie from the service
		Movie movie = movieService.getMovieById(movie_id);

		// set movie as a model attribute to pre-populate the form
		model.addAttribute("movie", movie);
		return "view_movie";
	}

	@GetMapping("/deleteMovie/{movie_id}")
	public String deleteMovie(@PathVariable(value = "movie_id") long movie_id) {

		// call delete movie method
		this.movieService.deleteMovieById(movie_id);
		return "redirect:/";
	}
}
