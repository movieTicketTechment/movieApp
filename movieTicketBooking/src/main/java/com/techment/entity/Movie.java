package com.techment.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;


 



@Entity
//@SQLDelete(sql = "UPDATE movie SET delete_Field = true WHERE movie_Id=?")
//@Where(clause = "delete_Field=false")
@Table(name= "movie")
public class Movie {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int movieId;
	
	@NotNull (message="Movie Name is required")
	@NotBlank (message="Movie Name can not be empty")
	private  String movieName;
	
	@NotNull (message="Movie Genre is required")
	@NotBlank (message="Movie Genre can not be empty")
	private  String movieGenre;
	
	
	@NotNull (message="Movie Hours is required")
	@NotBlank (message="Movie Hours can not be empty")
	private  String movieHours;	
	

	@NotNull (message="Movie Description is required")
	@NotBlank (message="Movie Description can not be empty")
	private  String movieDescription;
	private  String releaseDate;
	private  String updatedBy;
	@Column(name = "creationDate")
	@CreationTimestamp
	private Date createRecord;
	@UpdateTimestamp
	private  LocalDateTime updatedOn;
	private  Boolean deleteField=Boolean.FALSE;
	private  String status;
	private  String remark;
	private  String token;
	@OneToOne
	@JoinColumn(name="imageId"  ,referencedColumnName = "imageId")
	private ImageModel imageBanner;
	
	public Movie() {
		super();
	}

	public Movie(int movieId, String movieName, String movieGenre, String movieHours, String movieDescription,
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



	public Date getCreateRecord() {
		return createRecord;
	}

	public void setCreateRecord(Date createRecord) {
		this.createRecord = createRecord;
	}

	public ImageModel getImageBanner() {
		return imageBanner;
	}

	public void setImageBanner(ImageModel imageBanner) {
		this.imageBanner = imageBanner;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre + ", movieHours="
				+ movieHours + ", movieDescription=" + movieDescription + ", releaseDate=" + releaseDate
				+ ", updatedBy=" + updatedBy + ", createRecord=" + createRecord + ", updatedOn=" + updatedOn
				+ ", deleteField=" + deleteField + ", status=" + status + ", remark=" + remark + ", token=" + token
				+ ", imageBanner=" + imageBanner + "]";
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
	
	
//	String movieCategory;	
//	List <Language> movieLanguages;
//	String movieLanguages;
//	String movieFormat;
	
	
	
	
	
	
}
