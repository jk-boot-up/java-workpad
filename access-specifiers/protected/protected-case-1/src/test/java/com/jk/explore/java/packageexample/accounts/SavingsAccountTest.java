package com.jk.explore.java.packageexample.accounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SavingsAccountTest {

    @Test
    public void testAccess() {
        SavingsAccount savingsAccount = new SavingsAccount(1, 2000, 5);
        assertNotNull(savingsAccount);
        assertEquals(savingsAccount.getId(), 1);
        assertEquals(savingsAccount.getBalance(), 2000);
        assertEquals(savingsAccount.getInterestRate(), 5);
        assertEquals(savingsAccount.id, 1);
        assertEquals(savingsAccount.balance, 2000);
        assertEquals(savingsAccount.interestRate, 5);
    }
}
