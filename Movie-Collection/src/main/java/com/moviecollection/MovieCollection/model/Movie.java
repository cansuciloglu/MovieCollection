package com.moviecollection.MovieCollection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY) //otomatik artacagını ifade eder
	private Long movie_id;
	
	@Column(name="movie_name")
	private String movie_name;
	
	@Column(name="movie_year")
	private int movie_year;
	
	@Column(name="movie_category")
	private String movie_category;
	
	@Column(name="movie_description")
	private String movie_description;
	
	@Column(name="movie_media")
	private String movie_media;
	
	@Column(name="movie_lang")
	private String movie_lang;
	
	@Column(name="movie_director")
	private String movie_director;
	
	@Column(name="movie_lead")
	private String movie_lead;

	public Long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Long movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public int getMovie_year() {
		return movie_year;
	}

	public void setMovie_year(int movie_year) {
		this.movie_year = movie_year;
	}

	public String getMovie_category() {
		return movie_category;
	}

	public void setMovie_category(String movie_category) {
		this.movie_category = movie_category;
	}

	public String getMovie_description() {
		return movie_description;
	}

	public void setMovie_description(String movie_description) {
		this.movie_description = movie_description;
	}

	public String getMovie_media() {
		return movie_media;
	}

	public void setMovie_media(String movie_media) {
		this.movie_media = movie_media;
	}

	public String getMovie_lang() {
		return movie_lang;
	}

	public void setMovie_lang(String movie_lang) {
		this.movie_lang = movie_lang;
	}

	public String getMovie_director() {
		return movie_director;
	}

	public void setMovie_director(String movie_director) {
		this.movie_director = movie_director;
	}

	public String getMovie_lead() {
		return movie_lead;
	}

	public void setMovie_lead(String movie_lead) {
		this.movie_lead = movie_lead;
	}
	
	

}
