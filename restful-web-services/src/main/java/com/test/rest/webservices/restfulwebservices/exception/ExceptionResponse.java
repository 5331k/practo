package com.test.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timeStamp;
	private String message;
	private String details;

	public Date getTimeStamp() {
		return timeStamp;
	}

	public ExceptionResponse(Date timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	public Date getTimeStamp(Date timeStamp) {
		return timeStamp;
	}

}
