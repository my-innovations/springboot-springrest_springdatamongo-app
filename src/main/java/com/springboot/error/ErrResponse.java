package com.springboot.error;

public class ErrResponse {

	private String fieldname;
	private String errMsg;

	public ErrResponse(String fieldname, String errMsg) {
		super();
		this.fieldname = fieldname;
		this.errMsg = errMsg;
	}

	public String getFieldname() {
		return fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
