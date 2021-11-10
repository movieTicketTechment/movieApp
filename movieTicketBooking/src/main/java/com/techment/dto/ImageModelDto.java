package com.techment.dto;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.techment.entity.Movie;

public class ImageModelDto {

	
	public ImageModelDto() {
		super();
	}
	public ImageModelDto(String name, String type, byte[] picByte) {
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}
	
	public ImageModelDto(String name, String type, byte[] picByte, Movie movie) {
		super();
		
		this.name = name;
		this.type = type;
		this.picByte = picByte;
		this.movie = movie;
	}
	
	
	
	private int imageId;	
	private String name;	
	private String type;
    //image bytes can have large lengths so we specify a value
    //which is more than the default length for picByte column
	
	private byte[] picByte;

	private Movie movie;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getPicByte() {
		return picByte;
	}
	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "ImageModel [imageId=" + imageId + ", name=" + name + ", type=" + type + ", picByte="
				+ Arrays.toString(picByte) + ", movie=" + movie + "]";
	}

}
