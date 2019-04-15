package com.qa.accountApplication;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
	private static Map<Integer, Account> map= new HashMap<Integer, Account>();
	
	public static void addAccount(String fname, String lname, int accountNumber) {
		Account acc= new Account(fname, lname, accountNumber);
	    map.put(accountNumber, acc);
	}

	public static Account retrieveAccount(int accountNumber){
	    return map.get(accountNumber);
    }
}
