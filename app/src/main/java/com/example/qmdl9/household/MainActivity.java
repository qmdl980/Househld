package com.example.qmdl9.household;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends AppCompatActivity {
    int balance;
    String init;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        balance = 100;
        TextView Balance = (TextView) findViewById(R.id.balance);
        TextView Record = (TextView) findViewById(R.id.init);
        Balance.setText(Integer.toString(balance));
        Record.setText(init);
    }

    public void Deposit(View v){
        EditText deposit_amount = (EditText) findViewById(R.id.deposit_amount);
        EditText get_money = (EditText) findViewById(R.id.get_money);
        init = get_money.toString();
        int amount = Integer.parseInt(deposit_amount.getText().toString());
        balance += amount;
        TextView Balance = (TextView) findViewById(R.id.balance);
        TextView Record = (TextView) findViewById(R.id.init);
        Balance.setText(Integer.toString(balance));
        Record.setText(init);
    }
    public void Debit(View v){
        EditText debit_amount = (EditText) findViewById(R.id.debit_amount);
        EditText use_money = (EditText) findViewById(R.id.use_money);
        init = use_money.toString();
        int amount = Integer.parseInt(debit_amount.getText().toString());
        balance -= amount;
        TextView Balance = (TextView) findViewById(R.id.balance);
        TextView Record = (TextView) findViewById(R.id.init);
        Balance.setText(Integer.toString(balance));
        Record.setText(init);
    }
}