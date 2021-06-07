package com.moviecollection.MovieCollection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.moviecollection.MovieCollection.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	@Query("SELECT p FROM Movie p WHERE CONCAT(p.movie_name, p.movie_category, p.movie_year, p.movie_lead) LIKE %?1%")
	public List<Movie> search(String keyword);

	@Query("from Movie order by movie_year asc")
	public List<Movie> orderByAscending();

}
