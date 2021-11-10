package com.techment.dto;

public class ShowMovieTheatreDto {
	
	private  int showId;
	private   String showStartTime;
	private  String showEndTime;
	private  String showName;
	private  int movieId;
	private  String movieName;
	private  String movieHours;	
	private  String releaseDate;
	private  int theatreId;
	private  String theatreName;
	private String theatreCity;
	private int screenId;
	
	
	
	
	public ShowMovieTheatreDto(int showId, String showStartTime, String showEndTime, String showName, int movieId,
			String movieName, String movieHours, String releaseDate, int theatreId, String theatreName,String theatreCity,int screenId) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieHours = movieHours;
		this.releaseDate = releaseDate;
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.screenId=screenId;
	}
	
	

	public ShowMovieTheatreDto(int showId, String showStartTime, String showEndTime, String showName, int movieId,
			String movieName, String movieHours, String releaseDate, int theatreId, String theatreName) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieHours = movieHours;
		this.releaseDate = releaseDate;
		this.theatreId = theatreId;
		this.theatreName = theatreName;
	}



	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getTheatreCity() {
		return theatreCity;
	}

	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public String getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(String showStartTime) {
		this.showStartTime = showStartTime;
	}

	public String getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(String showEndTime) {
		this.showEndTime = showEndTime;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
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

	public String getMovieHours() {
		return movieHours;
	}

	public void setMovieHours(String movieHours) {
		this.movieHours = movieHours;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	
	
	
	
}