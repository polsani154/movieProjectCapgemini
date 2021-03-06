package com.movie.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="movie")
@SequenceGenerator(name="Seq",initialValue=1)
public class Movie {
	
	@Id
	@Column(name="movie_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Seq")
	private int movieId;
	
	@Column(name="movie_name",length=30)
	private String movieName;
	
	@Column(name="release_year",length=4)
	private int releaseYear;
	
	@Column(name="genre",length=30)
	private String genre;
	
	@Column(name="director",length=30)
	private String director;
	
	@Column(name="runtime",length=10)
	private int runtime;
	
	@Column(name="language")
	private String[] Language;
	
	@Column(name="hero",length=30)
	private String hero;
	
	@Column(name="heroine",length=30)
	private String heroine;
	
	@Column(name="trailer_link",length=30)
	private String trailerLink;
	
	@Column(name="image_links")
	private String[] imageLinks;
	
	

	public Movie() {
		super();
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public String[] getLanguage() {
		return Language;
	}

	public void setLanguage(String[] language) {
		Language = language;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public String getHeroine() {
		return heroine;
	}

	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	public String getTrailerLink() {
		return trailerLink;
	}

	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}

//	public String[] getImageLinks() {
//		return imageLinks;
//	}
//
//	public void setImageLinks(String[] imageLinks) {
//		this.imageLinks = imageLinks;
//	}
	
	
	

}
