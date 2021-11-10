package com.techment.exception;

public class UserNotFound  extends RuntimeException {
	
	String msg;

	public UserNotFound(String msg) {
		super(msg);
		this.msg = msg;
	}

	public UserNotFound() {
		super();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
