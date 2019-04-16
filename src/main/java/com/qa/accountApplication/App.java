package com.qa.accountApplication;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AccountService.addAccount("Tom", "Watkins", 12);
        System.out.println(AccountService.retrieveAccount(12).getFname()+" "+AccountService.retrieveAccount(12).getLname());
        AccountService.jsonify(AccountService.retrieveAccount(12));
        Account second= AccountService.dejsonify("{\"fname\":\"Tom\",\"lname\":\"Watkins\",\"accountNumber\":12}");
        System.out.println("\n"+second.getFname()+" "+second.getLname());
    }
}
