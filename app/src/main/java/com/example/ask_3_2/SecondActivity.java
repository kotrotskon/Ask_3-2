package com.example.ask_3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtVw_fname = findViewById(R.id.txtVw_fname);
        TextView txtVw_lname = findViewById(R.id.txtVw_lname);

        txtVw_fname.setText(getIntent().getExtras().getString("fname"));
        txtVw_lname.setText(getIntent().getExtras().getString("lname"));
    }
}