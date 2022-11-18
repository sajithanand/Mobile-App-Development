package com.exam21.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button b;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b = findViewById(R.id.button);
        t=findViewById(R.id.t2);

    }

    public void button(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}