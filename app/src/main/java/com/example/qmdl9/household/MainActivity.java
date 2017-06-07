package com.example.qmdl9.household;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends AppCompatActivity {
    int balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        balance = 100;
        TextView Balance = (TextView) findViewById(R.id.balance);
        Balance.setText(Integer.toString(balance));
    }

    public void Deposit(View v){
        EditText deposit_amount = (EditText) findViewById(R.id.deposit_amount);
        int amount = Integer.parseInt(deposit_amount.getText().toString());
        balance += amount;
        TextView Balance = (TextView) findViewById(R.id.balance);
        Balance.setText(Integer.toString(balance));
        /*Intent intent = new Intent(getApplicationContext(), SubActivity.class);
        startActivity(intent);*/
    }
    public void Debit(View v){
        EditText debit_amount = (EditText) findViewById(R.id.debit_amount);
        int amount = Integer.parseInt(debit_amount.getText().toString());
        balance -= amount;
        TextView Balance = (TextView) findViewById(R.id.balance);
        Balance.setText(Integer.toString(balance));
        /*Intent intent = new Intent(getApplicationContext(), SubActivity.class);
        startActivity(intent);*/
    }
}