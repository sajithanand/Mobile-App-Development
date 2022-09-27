package com.example.registration2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText fname,lname;
    RadioGroup gender;
    RadioButton male,female;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=findViewById(R.id.edit1);
        lname=findViewById(R.id.edit2);
        gender=findViewById(R.id.rg);
        male=findViewById(R.id.radio2);
        female=findViewById(R.id.radio3);
        submit=findViewById(R.id.button);
    }

    public void submit(View view) {
        RegandNavi();
    }

    private void RegandNavi() {
        SharedPreferences sharedPref=getSharedPreferences("My_pref",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPref.edit();
        editor.putString("Fname",fname.getText().toString());
        editor.putString("Lname",lname.getText().toString());

        String radiovalue="";
        switch(gender.getCheckedRadioButtonId()){
            case R.id.radio2:radiovalue="Male";
            break;
            case R.id.radio3:radiovalue="Female";
            break;
        }

        editor.putString("Gender",radiovalue);
        editor.apply();

        Intent intent=new Intent(this,Activity2.class);
        startActivity(intent);

    }
}