package com.qa.accountApplication;

public class Account {
	private String fname="";
	private String lname="";
	private int accountNumber=0;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Account(String fname, String lname, int accountNumber) {
		this.fname = fname;
		this.lname = lname;
		this.accountNumber = accountNumber;
	}
	
}
