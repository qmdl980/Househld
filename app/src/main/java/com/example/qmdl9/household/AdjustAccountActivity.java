package com.example.qmdl9.household;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class AdjustAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjust_account);
    }
    public void adjustAccount(View v){
        EditText adjustAccountNumber = (EditText) findViewById(R.id.adjustAccountNumber);
        EditText adjustBalance = (EditText) findViewById(R.id.adjustBalance);
        int accountNumber = Integer.parseInt(adjustAccountNumber.getText().toString());
        int cbalance = Integer.parseInt(adjustBalance.getText().toString());
        MainActivity.accounts.get(accountNumber - 1).setBalance(cbalance);
    }
}
