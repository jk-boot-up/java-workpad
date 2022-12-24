package com.jk.explore.java.packageexample.accounts;

public class SavingsAccount extends Account {

    protected int interestRate;

    public SavingsAccount(int id, int balance, int interestRate) {
        super(id, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        String display = "Savings account id is: " + id
                        + " , Balance is: " + getBalance()
                + " , Interest rate is: " + interestRate;

        return display;
    }

    protected int getInterestRate() {
        return interestRate;
    }

    protected void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    protected class SavingsLocker extends Locker {



        protected SavingsLocker(String model, String key) {
            super(model, key);
        }

        @Override
        public String toString() {

            return super.toString();
        }
    }
}



