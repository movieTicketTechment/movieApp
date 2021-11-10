package com.techment.dto;

import com.techment.entity.ImageModel;

public class MovieBannerDto {

	
	private  int movieId;
	private  String movieName;
	private  String movieGenre;
	private  String movieHours;	
	private  String movieDescription;
	private  String releaseDate;	
	private int imageId;
	private byte[] picByte;
	
    //image bytes can have large lengths so we specify a value
    //which is more than the default length for picByte column
	
	
	
	
	
	public MovieBannerDto() {
		super();
	}
	

	public MovieBannerDto(int movieId, String movieName, String movieGenre, String movieHours, String movieDescription,
			String releaseDate, int imageId, byte[] picByte) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieHours = movieHours;
		this.movieDescription = movieDescription;
		this.releaseDate = releaseDate;
		this.imageId = imageId;
		this.picByte = picByte;
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

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getMovieHours() {
		return movieHours;
	}

	public void setMovieHours(String movieHours) {
		this.movieHours = movieHours;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}



	public byte[] getPicByte() {
		return picByte;
	}



	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}
	
	
	
}
