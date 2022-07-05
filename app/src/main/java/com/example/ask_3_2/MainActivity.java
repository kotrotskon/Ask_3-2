package com.example.ask_3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edTxt_fname = findViewById(R.id.edTxt_fname);
        EditText edTxt_lname = findViewById(R.id.edTxt_lname);

        Button btn_save = findViewById(R.id.btn_save);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = edTxt_fname.getText().toString();
                String lname = edTxt_lname.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("fname", fname);
                intent.putExtra("lname", lname);

                startActivity(intent);
            }
        });
    }
}