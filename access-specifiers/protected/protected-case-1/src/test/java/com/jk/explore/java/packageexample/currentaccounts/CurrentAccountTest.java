package com.jk.explore.java.packageexample.currentaccounts;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CurrentAccountTest {

    @Test
    public void testAccess() {
        CurrentAccount currentAccount = new CurrentAccount(1, 400000, 5000);
        assertNotNull(currentAccount);
        out.println(currentAccount);
        assertEquals(currentAccount.getAnnualCharges(), 5000);
    }
}
