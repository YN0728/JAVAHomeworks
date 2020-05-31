package com.company;

public class Movie {

	private int rating;
	private String title;

	public Movie() {
	}

	public Movie(int rating, String movieName) {
		this.rating = rating;
		this.title = movieName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getMovieName() {
		return title;
	}

	public void setMovieName(String movieName) {
		this.title = movieName;
	}

}