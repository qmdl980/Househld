package com.example.qmdl9.household;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;

import java.util.*;


public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        TextView TotalBalance = (TextView) findViewById(R.id.totalBalance);
        TextView Account = (TextView) findViewById(R.id.AccountView);
        int total = 0;
        String account = "";
        for(int i = 0; i < MainActivity.accounts.size(); i++){
            String accountData = Integer.toString(i+1) + ". " + MainActivity.accounts.get(i).toString();
            account = account + accountData;
            total += MainActivity.accounts.get(i).getBalance();
        }
        Account.setText(account);
        TotalBalance.setText(Integer.toString(total));
    }

    public void addAccount(View v){
        Intent intent_01 = new Intent(getApplicationContext(),AddAccountActivity.class);
        startActivity(intent_01);
    }

    public void adjustAccount(View v){
        Intent intent_01 = new Intent(getApplicationContext(),AdjustAccountActivity.class);
        startActivity(intent_01);
    }
}
