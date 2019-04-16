package com.qa.accountApplication;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
	public Map<Integer, Account> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Account> map) {
		this.map = map;
	}

	private Map<Integer, Account> map= new HashMap<Integer, Account>();
	
	public void addAccount(String fname, String lname, int accountNumber) {
		Account acc= new Account(fname, lname, accountNumber);
	    map.put(accountNumber, acc);
	}

	public Account retrieveAccount(int accountNumber){
	    return map.get(accountNumber);
    }


}
