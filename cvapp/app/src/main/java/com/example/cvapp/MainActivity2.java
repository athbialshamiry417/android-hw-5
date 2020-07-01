package com.example.cvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView n = findViewById(R.id.t1);
        TextView d = findViewById(R.id.t2);
        TextView m = findViewById(R.id.t3);
        TextView o = findViewById(R.id.t4);
        TextView y = findViewById(R.id.t5);

        Bundle r = getIntent().getExtras();
        n.setText(r.getString("wee"));
        d.setText(r.getString("mee"));
        o.setText(r.getString("gee"));
        y.setText(r.getString("aee"));

    }
}