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
        TextView Account = (TextView) findViewById(R.id.AccountView);
        String account = "";
        for(int i = 0; i < MainActivity.accounts.size(); i++){
            String accountData = MainActivity.accounts.get(i).toString();
            account = account + accountData;
        }
        Account.setText(account);
    }

    public void addAccount(View v){
        Intent intent_01 = new Intent(getApplicationContext(),AddAccountActivity.class);
        startActivity(intent_01);
    }
}
