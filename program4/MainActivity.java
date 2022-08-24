package com.exam21.validationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname,lname,passwd;
    RadioButton Female,Male;
    Switch newPerson;
    CheckBox Terms;
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UiInit();
    }

    public void UiInit(){
        fname=findViewById(R.id.t1);
        lname=findViewById(R.id.t2);
        passwd=findViewById(R.id.p1);
        Female=findViewById(R.id.f1);
        Male=findViewById(R.id.m1);
        newPerson=findViewById(R.id.s1);
        Terms=findViewById(R.id.c1);
        Submit=findViewById(R.id.b1);
    }
    public Boolean validate(){
        Boolean status=false;
        String fn=fname.getText().toString();
        String ln=lname.getText().toString();
        String Password=passwd.getText().toString();
        if(fn.equals("")){
            Toast.makeText(this,"Enter FirstName",Toast.LENGTH_SHORT).show();

        }
        else if (ln.equals("")){
            Toast.makeText(this,"Enter Last name",Toast.LENGTH_SHORT).show();
        }
        else if (passwd.length()<3){
            Toast.makeText(this,"Enter valid password",Toast.LENGTH_SHORT).show();
        }
        else if (!Male.isChecked() && !Female.isChecked()) {
            Toast.makeText(this, "Please select gender", Toast.LENGTH_SHORT).show();
        }
        else if (!newPerson.isChecked()) {
            Toast.makeText(this, "Accept terms and conditions", Toast.LENGTH_SHORT).show();
        }
        else {
            status=true;
        }
        return status;

    }
}