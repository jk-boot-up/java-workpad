package com.jk.explore.java.packageexample.accounts;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testEmployee() {
        Employee e = new Employee("ABC", 100);
        SavingsAccount savingsAccount = new SavingsAccount(200, 10000, 5);
        e.setSavingsAccount(savingsAccount);
        out.println(savingsAccount);
        assertEquals(e.getSavingsAccount().id, savingsAccount.id);
        assertEquals(e.getSavingsAccount().balance, savingsAccount.balance);
        assertEquals(e.getSavingsAccount().interestRate, savingsAccount.interestRate);
    }
}
