package com.springboot.document;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

//import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document
@Document(collection = "users")
public class User {
	
	/**
	 * ########################################################################################
	 * Private member variables
	 * ########################################################################################
	 */

	@Id
	private String userId;
	
	@NotEmpty
	@Size(max = 10)
	private String name;
	
	private Date creationDate = new Date();
	
	private Map<String, String> userSettings = new HashMap<>();
	
	public User() {}
	
	/**
	 * ########################################################################################
	 * setters and getters
	 * ########################################################################################
	 * 
	 */

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Map<String, String> getUserSettings() {
		return userSettings;
	}

	public void setUserSettings(Map<String, String> userSettings) {
		this.userSettings = userSettings;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", creationDate=" + creationDate + ", userSettings="
				+ userSettings + "]";
	}
	
}

