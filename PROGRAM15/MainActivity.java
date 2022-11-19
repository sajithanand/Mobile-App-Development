package com.exam21.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    Button btn ;
    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.b1);
        tv=findViewById(R.id.t1);

    }
    public void button(View view) {
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);
    }
}

