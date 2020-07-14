package com.codingdojo.bankaccount;
import java.util.*;

public class BankAccountTest {
	public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();
        BankAccount bankAccount4 = new BankAccount();
        
        System.out.println("Account Number: " + bankAccount.getAccount_number());
        System.out.println("Main Account Balance: " + bankAccount.getAccount_balance());
        System.out.println("Savings Account Balance: " + bankAccount.getSavings_balance());
        bankAccount.addBalanceToAccount(150.0);
        bankAccount.withdrawBalanceToAccount(20.0);
        bankAccount.addSavingsToAccount(50.0);
        System.out.println("Main Account Balance after transactions: " + bankAccount.getAccount_balance());
        System.out.println("Savings Account Balance after transactions: " + bankAccount.getSavings_balance());
        bankAccount.withdrawBalanceToAccount(200.0);
        System.out.println("TOTAL BALANCE ACCOUNTS:");
        bankAccount.getTotal_account_money();
        
        System.out.println("Account Number: " + bankAccount2.getAccount_number());
        System.out.println("Main Account Balance: " + bankAccount2.getAccount_balance());
        System.out.println("Savings Account Balance: " + bankAccount2.getSavings_balance());
        bankAccount2.addBalanceToAccount(1300.0);
        bankAccount2.addSavingsToAccount(2000.0);
        System.out.println("Main Account Balance after transactions: " + bankAccount2.getAccount_balance());
        System.out.println("Savings Account Balance after transactions: " + bankAccount2.getSavings_balance());
        System.out.println("TOTAL BALANCE ACCOUNTS:");
        bankAccount2.getTotal_account_money();
        
        System.out.println(BankAccount.accounts_counter);
    }
}