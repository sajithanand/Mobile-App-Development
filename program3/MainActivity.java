package com.exam21.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1,b2,b3,b4;
        EditText t1=(EditText)findViewById(R.id.txt1);
        EditText t2=(EditText)findViewById(R.id.txt1);
        b1=(Button)findViewById(R.id.bt1);
        b2=(Button)findViewById(R.id.bt2);
        b3=(Button)findViewById(R.id.bt3);
        b4=(Button)findViewById(R.id.bt4);
        TextView tv1=findViewById(R.id.txt3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x,y,z;
                x=Float.parseFloat(t1.getText().toString());
                y=Float.parseFloat(t2.getText().toString());
                z=x+y;
                tv1.setText(Float.toString(z));
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x,y,z;
                x=Float.parseFloat(t1.getText().toString());
                y=Float.parseFloat(t2.getText().toString());
                z=x-y;
                tv1.setText(Float.toString(z));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x,y,z;
                x=Float.parseFloat(t1.getText().toString());
                y=Float.parseFloat(t2.getText().toString());
                z=x*y;
                tv1.setText(Float.toString(z));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x,y,z;
                x=Float.parseFloat(t1.getText().toString());
                y=Float.parseFloat(t2.getText().toString());
                z=x/y;
                tv1.setText(Float.toString(z));
            }
        });



    }

}