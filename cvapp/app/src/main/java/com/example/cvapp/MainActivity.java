package com.example.cvapp;

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
        final EditText name = findViewById(R.id.ed);
        final EditText age = findViewById(R.id.ed2);
        final EditText job = findViewById(R.id.ed3);
        final EditText phone = findViewById(R.id.ed4);
        final EditText mail = findViewById(R.id.ed5);
        Button next = findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("wee", name.getText().toString());
                i.putExtra("mee", age.getText().toString());
                i.putExtra("dee", job.getText().toString());
                i.putExtra("gee", phone.getText().toString());
                i.putExtra("aee", mail.getText().toString());
                startActivity(i);
            }
        });
    }
}