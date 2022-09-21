package com.springmvc.mvc.user;

public class User {
	
	String emailFilled;
	String pass;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String emailFilled, String pass) {
		super();
		this.emailFilled = emailFilled;
		this.pass = pass;
	}
	public String getEmailFilled() {
		return emailFilled;
	}
	public void setEmailFilled(String emailFilled) {
		this.emailFilled = emailFilled;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [emailFilled=" + emailFilled + ", pass=" + pass + "]";
	}

}
