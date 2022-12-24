package com.jk.explore.java.packageexample.accounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {

    @Test
    public void testAccess() {
        Account account = new Account(1, 1000);
        assertNotNull(account);
        assertEquals(account.getId(), 1);
        assertEquals(account.getBalance(), 1000);
        assertEquals(account.id, 1);
        assertEquals(account.balance, 1000);
    }
}

