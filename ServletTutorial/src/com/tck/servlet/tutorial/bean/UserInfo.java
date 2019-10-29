package com.tck.servlet.tutorial.bean;

public class UserInfo {
	private String userName;
	private int post;
	private String country;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPost() {
		return this.post;
	}

	public void setPost(int post) {
		this.post = post;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public UserInfo() {

	}

	public UserInfo(String userName, int post, String country) {
		this.userName = userName;
		this.post = post;
		this.country = country;
	}
}
