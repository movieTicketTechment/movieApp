package com.techment.dto;

public class ScreenTheatreDto {

	private  int screenId;
	private  String screenName;
	private  int theatreId;
	private  String theatreName;
	private String managerName;
	private int screenRows;
	private int screenColumns;
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
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
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getScreenRows() {
		return screenRows;
	}
	public void setScreenRows(int screenRows) {
		this.screenRows = screenRows;
	}
	public int getScreenColumns() {
		return screenColumns;
	}
	public void setScreenColumns(int screenColumns) {
		this.screenColumns = screenColumns;
	}
	
	public ScreenTheatreDto(int screenId, String screenName, int theatreId, String theatreName, String managerName,
			int screenRows, int screenColumns) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.managerName = managerName;
		this.screenRows = screenRows;
		this.screenColumns = screenColumns;
	}
	public ScreenTheatreDto() {
		super();
	}
	
}
