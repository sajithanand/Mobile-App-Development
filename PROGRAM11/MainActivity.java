package com.exam21.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    ListView l;
    String names[] = { "Junaid", "JITHU", "ASWIN", "ABIN","ALEN","SANAN"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.line1);
        ArrayAdapter<String> arr;
        arr =new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,names);
        l.setAdapter(arr);
    }
}