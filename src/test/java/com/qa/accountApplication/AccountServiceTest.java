package com.qa.accountApplication;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;

public class AccountServiceTest extends TestCase {
    private AccountService accountService;

    @Before
    public void setUp() throws Exception {
        accountService =  new AccountService();
        accountService.addAccount("Maria", "Watkins", 12);
        accountService.addAccount("Nil", "Montia", 4);
        accountService.addAccount("Nil", "Bosch", 1);
        accountService.addAccount("Maria", "Sellas", 34);
    }

    public void tearDown() throws Exception {
    }

    public void testCreateAccountService(){
        AccountService accounty=new AccountService();
        assertNotNull(accounty);
    }

    public void testGetMap() {
    }

    public void testSetMap() {
    }

    public void testAddAccount() {
    }

    public void testRetrieveAccount() {
    }
}