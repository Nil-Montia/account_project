package com.qa.accountApplication;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Json {
    private Gson gson= new Gson();

    public void jsonMap(Map map){
        String json=gson.toJson(map);
        System.out.println(json);
        gson.toJson(map, System.out);
    }
    public void jsonify(Account acc){
        gson.toJson(acc, System.out);
    }

    public Account dejsonifyAccount(String json){
        return gson.fromJson(json, Account.class);
    }

    public Map<Integer, Account> fromJsonMap(String json){
        Map<Integer, Account> accountMap = gson.fromJson(json, HashMap.class);
        return accountMap;
    }


}
