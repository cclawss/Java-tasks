package com.company.Bank;

public abstract class Account {
    protected int money;
    protected String accountName;

    public Account(int money, String accountName) {
        this.money = money;
        this.accountName = accountName;
    }

    abstract boolean pay(int amount);

    abstract boolean transfer(Account account, int amount);

    abstract boolean addMoney(int amount);

    @Override
    public String toString() {
        return accountName;
    }

}
