package com.qa.accountApplication;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
	private static Gson gson= new Gson();
	private static Map<Integer, Account> map= new HashMap<Integer, Account>();
	
	public static void addAccount(String fname, String lname, int accountNumber) {
		Account acc= new Account(fname, lname, accountNumber);
	    map.put(accountNumber, acc);
	}

	public static Account retrieveAccount(int accountNumber){
	    return map.get(accountNumber);
    }

    public static void jsonify(Account acc){
		gson.toJson(acc, System.out);
	}

	public static Account dejsonify(String json){
		return gson.fromJson(json, Account.class);
	}

}
