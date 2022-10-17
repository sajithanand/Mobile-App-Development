package com.exam21.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tview = findViewById(R.id.t1);
        Bundle Extra = getIntent().getExtras();
        String name = Extra.getString("name");
        String initial = Extra.getString("initial");
        tview.setText(name+"\n"+initial);
    }
}
