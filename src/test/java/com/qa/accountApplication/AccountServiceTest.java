package com.qa.accountApplication;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

public class AccountServiceTest extends TestCase {
    private AccountService accountService;

    @Before
    public void setUp() throws Exception {
        accountService =  new AccountService();
        accountService.addAccount("Maria", "Watkins", 1);
        accountService.addAccount("Nil", "Watkins", 2);
        accountService.addAccount("Nil", "Montia", 3);
        accountService.addAccount("Nil", "Bosch", 4);
        accountService.addAccount("Maria", "Sellas", 5);
        accountService.addAccount("Jane", "Selli", 6);
        accountService.addAccount("Marta", "Watkins", 7);
        accountService.addAccount("Marta", "Watki", 8);
        accountService.addAccount("Marta", "Watins", 9);
        accountService.addAccount("Marta", "Wakins", 10);
        accountService.addAccount("Marta", "Watkis", 11);


    }

    @After
    public void tearDown() throws Exception {
        accountService=null;
    }

    @Test
    public void testCreateAccountService(){
        AccountService accounty=new AccountService();
        assertNotNull(accounty);
    }

    @Test
    public void testGetMap() {
        assertNotNull(accountService.getMap());
    }


    @Test
    public void testCycleMethodTakesArguments() {
        accountService.nameCycle("Maria");
    }

    @Test
    public void testCount(){
        assertEquals(2, accountService.
                nameCycle("Maria"));

    }

    @Test
    public void testCount2(){
        assertEquals(3, accountService.nameCycle("Nil"));
    }

    @Test
    public void testCount3(){
        Random myRandom= new Random();
        String fname= " "+(char) (myRandom.nextInt(26) + 'A') +(char) (myRandom.nextInt(26) + 'a') +(char) (myRandom.nextInt(26) + 'a');
        accountService.addAccount(fname, "Watkins", 12);
        accountService.addAccount(fname, "Watki", 13);
        accountService.addAccount(fname, "Watins", 14);
        assertEquals(3, accountService.nameCycle(fname));
    }
}