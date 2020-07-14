package com.codingdojo.bankaccount;
import java.util.*;

public class BankAccount {
	private int account_number;
    private double account_balance;
    private double savings_balance;
    static int accounts_counter = 0;

    public BankAccount(){
        this.account_number = randomNumbersAccount();
        accounts_counter += 1;
    }

    private int randomNumbersAccount(){
    	return (int) (Math.random() * Math.pow(10, 10));
    }

    public long getAccount_number() {
    	return account_number;
    }
    
    public double getAccount_balance() {
        return account_balance;
    }

    public double getSavings_balance() {
        return savings_balance;
    }
    
    public void addBalanceToAccount(double money){
        this.account_balance += money;
    }

    public void addSavingsToAccount(double money){
        this.savings_balance += money;
    }
    
    public void withdrawBalanceToAccount(double money) {
    	if(account_balance < money) {
    		System.out.println("Sorry, your balance account is insufficient for this transaction");
    	} else {
    		this.account_balance -= money;
    	}
    }
    
    public void withdrawSavingsToAccount(double money) {
    	if(savings_balance < money) {
    		System.out.println("Sorry, your balance account is insufficient for this transaction");
    	} else {
    		this.savings_balance -= money;
    	}
    }

    public void getTotal_account_money() {
        System.out.println(account_balance);
        System.out.println(savings_balance);
    }
}