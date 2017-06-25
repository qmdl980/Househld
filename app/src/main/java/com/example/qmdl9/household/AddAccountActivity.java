package com.example.qmdl9.household;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.content.*;
import android.view.*;

public class AddAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);
    }
    public void add_Account(View v){
        EditText BankName = (EditText) findViewById(R.id.BankName);
        EditText BankNumber = (EditText) findViewById(R.id.BankNumber);
        EditText Balance = (EditText) findViewById(R.id.Balance);
        MainActivity.accounts.add(new Account(BankName.getText().toString(), BankNumber.getText().toString(), Integer.parseInt(Balance.getText().toString())));
    }
}
