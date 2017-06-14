package com.example.qmdl9.household;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;


public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }
    public void backHome(View v){
        Intent intent_01 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent_01);
    }
}
