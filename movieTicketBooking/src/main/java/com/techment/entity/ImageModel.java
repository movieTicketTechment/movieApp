package com.techment.entity;
import java.util.Arrays;

import javax.persistence.*;
@Entity
@Table(name = "image_table")
public class ImageModel {
	public ImageModel() {
		super();
	}
	public ImageModel(String name, String type, byte[] picByte) {
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}
	
	
	
	@Id
	@Column(name = "imageId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imageId;
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;
    //image bytes can have large lengths so we specify a value
    //which is more than the default length for picByte column
	@Column(name = "picByte", length = 50000000)
	private byte[] picByte;
	
	
	
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
	@Override
	public String toString() {
		return "ImageModel [imageId=" + imageId + ", name=" + name + ", type=" + type + ", picByte="
				+ Arrays.toString(picByte) + "]";
	}
	
	
	
}