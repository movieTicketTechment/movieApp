package com.techment.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.techment.entity.Theatre;

public class ScreenDto {

	private  int screenId;
	
	
	private  String screenName;
	private  int screenRows;
	private  int screenColumns;
	private  String updatedBy;
	private  LocalDateTime updatedOn;
	private  Boolean deleteField;
	private  String status;
	private  String remark;
	private  String token;	
	private Theatre theatre;
 


	public ScreenDto() {
		super();
	}

}