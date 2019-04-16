package com.qa.accountApplication;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountServiceTest extends TestCase {
    private AccountService accountService;

    @Before
    public void setUp() throws Exception {
        accountService =  new AccountService();
        accountService.addAccount("Maria", "Watkins", 12);
        accountService.addAccount("Nil", "Watkins", 23);
        accountService.addAccount("Nil", "Montia", 4);
        accountService.addAccount("Nil", "Bosch", 1);
        accountService.addAccount("Maria", "Sellas", 34);
    }

    public void tearDown() throws Exception {
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
        assertEquals(2, accountService.nameCycle("Maria"));
    }

    @Test
    public void testCount2(){
        assertEquals(3, accountService.nameCycle("Nil"));
    }
}