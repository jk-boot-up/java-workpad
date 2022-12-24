package com.jk.explore.java.packageexample;

import com.jk.explore.java.packageexample.accounts.SavingsAccount;
import com.jk.explore.java.packageexample.currentaccounts.CurrentAccount;

import static java.lang.System.out;

public class ProtectedKeywordExample {
    public static void main(String[] args) {
        out.println("Protected keyword example!");
        SavingsAccount savingsAccount = new SavingsAccount(1, 2000, 5);
        out.println(savingsAccount.toString());
        CurrentAccount currentAccount = new CurrentAccount(10, 10000, 500);
        out.println(currentAccount);
    }

}