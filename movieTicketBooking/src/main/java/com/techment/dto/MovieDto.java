package com.techment.dto;

import java.time.LocalDateTime;

import com.techment.entity.ImageModel;



public class MovieDto {

	private  int movieId;
	private  String movieName;
	private  String movieGenre;
	private  String movieHours;	
	private  String movieDescription;
	private  String releaseDate;
	private  String updatedBy;
	private  LocalDateTime updatedOn;
	private  Boolean deleteField;
	private  String status;
	private  String remark;
	private  String token;
	private ImageModel imageBanner;
	public MovieDto() {
		super();
	}

	@Override
	public String toString() {
		return "MovieDto [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre
				+ ", movieHours=" + movieHours + ", movieDescription=" + movieDescription + ", releaseDate="
				+ releaseDate + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + ", deleteField=" + deleteField
				+ ", status=" + status + ", remark=" + remark + ", token=" + token + "]";
	}
	public MovieDto(int movieId, String movieName, String movieGenre, String movieHours, String movieDescription,
			String releaseDate, String updatedBy, LocalDateTime updatedOn, Boolean deleteField, String status,
			String remark, String token, ImageModel imageBanner) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieHours = movieHours;
		this.movieDescription = movieDescription;
		this.releaseDate = releaseDate;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.deleteField = deleteField;
		this.status = status;
		this.remark = remark;
		this.token = token;
		this.imageBanner = imageBanner;
	}


	

	public ImageModel getImageBanner() {
		return imageBanner;
	}
	public void setImageBanner(ImageModel imageBanner) {
		this.imageBanner = imageBanner;
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
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
	public Boolean getDeleteField() {
		return deleteField;
	}
	public void setDeleteField(Boolean deleteField) {
		this.deleteField = deleteField;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	
	
	
	
}
