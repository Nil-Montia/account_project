package com.qa.accountApplication;


import java.util.Map;

public class App
{
    public static void main( String[] args )
    {
        Json json = new Json();
        System.out.println( "Hello World!" );
        AccountService.addAccount("Tom", "Watkins", 12);
        AccountService.addAccount("Maria", "Smith", 23);
        System.out.println(AccountService.retrieveAccount(12).getFname()+" "+AccountService.retrieveAccount(12).getLname());
        json.jsonify(AccountService.retrieveAccount(12));
        Account second= json.dejsonifyAccount("{\"fname\":\"Tom\",\"lname\":\"Watkins\",\"accountNumber\":12}");
        System.out.println("\n"+second.getFname()+" "+second.getLname());
        json.jsonMap(AccountService.getMap());
        String map="{34:{\"fname\":\"Tom\",\"lname\":\"Watkins\",\"accountNumber\":12}";
        Map<Integer, Account> m2=json.fromJsonMap(map);
        json.jsonMap(m2);
    }
}
