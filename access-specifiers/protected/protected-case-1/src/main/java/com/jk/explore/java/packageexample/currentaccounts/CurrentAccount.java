package com.jk.explore.java.packageexample.currentaccounts;

import com.jk.explore.java.packageexample.accounts.Account;

public class CurrentAccount extends Account {

    protected int annualCharges;

    public CurrentAccount(int id, int balance, int annualCharges) {
        super(id, balance);
        this.annualCharges = annualCharges;
    }

    protected int getAnnualCharges() {
        return annualCharges;
    }

    protected void setAnnualCharges(int annualCharges) {
        this.annualCharges = annualCharges;
    }

    @Override
    public String toString() {
        String display = "Current account id is: " + getId()
                + " Balance: " + this.balance +
                " , Annual charges are: " + annualCharges;
        return display;
    }
}
