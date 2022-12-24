package com.jk.explore.java.packageexample.accounts;

public class Employee {

    private String name;
    private int id;
    private SavingsAccount savingsAccount;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", savingsAccount Id =" + savingsAccount.id +
                ", savingsAccount Balnce =" + savingsAccount.getBalance() +
                '}';
    }
}
