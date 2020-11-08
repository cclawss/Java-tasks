package com.company.Bank;

public class CreditAccount extends Account {


    public CreditAccount(int money, String accountName) {
        super(-money, accountName);
    }

    @Override
    boolean pay(int amount) {
        money -= amount;
        System.out.printf("Произведён перевод на сумму " + amount + " руб\n" +
                "Ваш баланс: " + money + " руб\n");
        return true;
    }

    @Override
    boolean transfer(Account account, int amount) {
        if (money < 0) {
            if (account.addMoney(amount)) {
                money -= amount;
                account.addMoney(amount);
                System.out.println("Произведён перевод на сумму " + amount + " руб\n" +
                        "Ваш баланс: " + money + " руб\n");
                return true;
            }
        }
        return true;
    }

    @Override
    boolean addMoney(int amount) {
        if (money == 0) {
            System.out.println("Кредит погашен\n");
            return false;
        } else if (money + amount > 0) {
            System.out.println("Ошибка. " +
                    "Чтобы закрыть счёт вам необходимо заплатить:" + Math.abs(money) + " руб\n");
            return false;
        } else {
            money += amount;
            System.out.println("Ваш баланс пополнился на сумму " + amount + " руб.\n" +
                    "Общий баланс: " + money + " руб\n");
            return true;
        }
    }
}
