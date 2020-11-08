package com.company.Bank;


public class Main {
    public static Account creditAccount = new CreditAccount(0, "credit");
    public static Account checkingAccount = new CheckingAccount(0, "checking");
    public static Account savingsAccount = new SavingsAccount(0, "saving");


    public static void main(String[] args) {
        checkingAccount.transfer(creditAccount, 123);
        savingsAccount.transfer(creditAccount, 150);
        System.out.println("---------------------------------------------------------------");
        savingsAccount.addMoney(1000);
        checkingAccount.addMoney(1000);
        System.out.println("---------------------------------------------------------------");
        checkingAccount.transfer(creditAccount, 123);
        savingsAccount.transfer(creditAccount, 150);
        System.out.println("---------------------------------------------------------------");
        creditAccount = new CreditAccount(200, "credit");
        checkingAccount.transfer(creditAccount, 100);
        savingsAccount.transfer(creditAccount, 150);
        System.out.println("---------------------------------------------------------------");
        savingsAccount.transfer(creditAccount, 100);
        System.out.println("---------------------------------------------------------------");
        savingsAccount.transfer(creditAccount, 100);
        creditAccount.pay(50);
        System.out.println("---------------------------------------------------------------");
        creditAccount.transfer(savingsAccount, 200);
        System.out.println("---------------------------------------------------------------");
        creditAccount.addMoney(250);
    }
}
