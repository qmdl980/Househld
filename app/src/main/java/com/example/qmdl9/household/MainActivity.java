package com.example.qmdl9.household;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.content.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    private int balance;
    ArrayList<Record> records = new ArrayList<Record>();
    private Cash cash = new Cash();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Balance = (TextView) findViewById(R.id.balance);
        Balance.setText(Integer.toString(cash.getCashBalnce()));
    }

    public void deposit(View v){
        EditText deposit_amount = (EditText) findViewById(R.id.deposit_amount);
        EditText get_money = (EditText) findViewById(R.id.get_money);
        records.add(new Record("deposit", get_money.getText().toString(), deposit_amount.getText().toString()));
        int amount = Integer.parseInt(deposit_amount.getText().toString());
        cash.deposit(amount);
        TextView Balance = (TextView) findViewById(R.id.balance);
        Balance.setText(Integer.toString(cash.getCashBalnce()));
    }
    public void debit(View v){
        EditText debit_amount = (EditText) findViewById(R.id.debit_amount);
        EditText use_money = (EditText) findViewById(R.id.use_money);
        records.add(new Record("debit", use_money.getText().toString(), debit_amount.getText().toString()));
        int amount = Integer.parseInt(debit_amount.getText().toString());
        cash.debit(amount);
        TextView Balance = (TextView) findViewById(R.id.balance);
        Balance.setText(Integer.toString(cash.getCashBalnce()));
    }
    public void onClickAccountSet(View v){
        Intent intent_01 = new Intent(getApplicationContext(),AccountActivity.class);
        startActivity(intent_01);
    }
}