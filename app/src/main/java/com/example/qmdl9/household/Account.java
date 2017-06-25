package com.example.qmdl9.household;

/**
 * Created by qmdl9 on 2017-05-31.
 */

public class Account implements BankSystem {
    private String accountNumber;
    private String bankName;
    private int balance;
    protected double interest;

    public Account(){
        balance = 0;
    }
    public Account(String bankName, String accountNumber, int balance){
        this.balance = balance;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        balance = 0;
    }
    public void setInterest(double interest){
        this.interest = interest;
    }
    public void deposit(int amount){
        balance += amount;
    }

    public void debit(int amount){
        if(balance >= amount) {
            balance -= amount;
        }
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int amount){
        balance = amount;
    }
    @Override
    public String toString(){
        return(bankName + " " + accountNumber + " " + Integer.toString(balance)+ "원\n");
    }
}