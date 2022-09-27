package com.example.registration2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    Button b1;
    TextView fn,ln,gen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        b1=findViewById(R.id.button2);
        fn=findViewById(R.id.textView5);
        ln=findViewById(R.id.textView6);
        gen=findViewById(R.id.textView7);

    }

    public void fetchdata(View view) {
        SharedPreferences sharedPref=getSharedPreferences("My_pref",MODE_PRIVATE);
        fn.setText("First Name = "+sharedPref.getString("Fname",""));
        ln.setText("Last Name = "+sharedPref.getString("Lname",""));
        gen.setText("Gender = "+sharedPref.getString("Gender",""));

    }
}