package com.example.assignment2application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HelloActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        TextView V = (TextView) findViewById(R.id.textView);
        Intent i = getIntent();
        V.setText("Hello, " + i.getStringExtra("personName"));
    }
}