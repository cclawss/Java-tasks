package com.company.Bank;

public class SavingsAccount extends Account {

    public SavingsAccount(int money, String accountName) {
        super(money, accountName);
    }

    @Override
    boolean pay(int amount) {
        System.out.println("Невозможно выполнить платёж\n");
        return true;
    }

    @Override
    boolean transfer(Account account, int amount) {
        if ((money - amount) > 0) {
            if (account.addMoney(amount)) {
                money -= amount;
                System.out.println("Произведён перевод на сумму " + amount + " руб\n" +
                        "Ваш баланс: " + money + " руб\n");
            }
            return true;
        } else {
            System.out.println("Недостаточно средств на балансе\n");
            return false;
        }
    }


    @Override
    boolean addMoney(int amount) {
        money += amount;
        System.out.println("Ваш баланс пополнился на сумму " + amount + " руб.\n" +
                "Общий баланс: " + money + " руб\n");
        return true;
    }
}
