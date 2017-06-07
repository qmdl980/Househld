/**
 * Created by qmdl9 on 2017-05-31.
 */

public class Account implements BankSystem{
    private double balance;
    protected double interest;

    public Account(){
        balance = 0;
    }
    public Account(double balance){
        this.balance = balance;
        balance = 0;
    }
    public void setInterest(double interest){
        this.interest = interest;
    }
    public void Deposit(double amount){
        balance += amount;
    }

    public void Debit(double amount){
        if(balance < amount){
            System.out.println("계좌에 출금할 금액이 부족합니다.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
