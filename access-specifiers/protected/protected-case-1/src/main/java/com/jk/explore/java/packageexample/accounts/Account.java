package com.jk.explore.java.packageexample.accounts;

import static java.lang.System.out;

public class Account {

    protected int id;

    protected int balance;

    protected int getBalance() {
        return balance;
    }

    protected void setBalance(int balance) {
        this.balance = balance;
    }

    protected Locker locker;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
        locker = new Locker("digital lock", "123");
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void lock() {
        locker.lock();
    }

    protected void unlock() {
        locker.unlock();
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", locker=" + locker +
                '}';
    }

    protected class Locker {
        protected String model;
        protected String key;

        protected String getModel() {
            return model;
        }

        protected void setModel(String model) {
            this.model = model;
        }

        protected String getKey() {
            return key;
        }

        protected void setKey(String key) {
            this.key = key;
        }

        protected Locker(String model, String key) {
            this.model = model;
            this.key = key;
        }

        protected void lock() {
            out.println("Locker state changed to locked stated");
        }

        protected void unlock() {
            out.println("Locker state changed to unlocked state");
        }

        @Override
        public String toString() {
            return "Locker{" +
                    "model='" + model + '\'' +
                    ", key='" + key + '\'' +
                    '}';
        }
    }


}


