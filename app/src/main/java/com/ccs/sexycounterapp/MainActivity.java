package com.ccs.sexycounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void increaseCount(View v){
        TextView count = (TextView) findViewById(R.id.textView2);
        c++;
        count.setText("Count is:"+ String.valueOf(c));
    }
}