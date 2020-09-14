package com.springboot.error;

import java.util.Date;
import java.util.List;

public class ErrorResponse {

	private String errMsg;
	private List<String> errDetails;
	private Date timestamp;

	public ErrorResponse(String errMsg, List<String> errDetails, Date timestamp) {
		super();
		this.errMsg = errMsg;
		this.errDetails = errDetails;
		this.timestamp = timestamp;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public List<String> getErrDetails() {
		return errDetails;
	}

	public void setErrDetails(List<String> errDetails) {
		this.errDetails = errDetails;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
