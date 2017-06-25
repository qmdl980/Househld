package com.example.qmdl9.household;

/**
 * Created by qmdl9 on 2017-06-25.
 */

public class Cash implements BankSystem {
    private int balance;

    public Cash(){
        balance = 0;
    }

    public void debit(int amount){
        balance += amount;
    }

    public void deposit(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public int getCashBalnce(){
        return balance;
    }
}
