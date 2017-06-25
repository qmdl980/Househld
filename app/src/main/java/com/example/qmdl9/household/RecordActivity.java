package com.example.qmdl9.household;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        TextView Record = (TextView) findViewById(R.id.RecordView);
        String record = "";
        for(int i = 0; i < MainActivity.records.size(); i++) {
            String recordData = MainActivity.records.get(i).toString();
            record = record + recordData;
        }
        Record.setText(record);
    }

}
