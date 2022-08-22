package com.exam21.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("My_Tag","on create");
        Toast.makeText(this, "Activity created", Toast.LENGTH_SHORT).show();
        Button b1=findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {Activity2();}
            });
        }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("My_Tag", "on start");
        Toast.makeText(this, "Activity started", Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("My_Tag", "on resume");
        Toast.makeText(this, "Activity resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("My_Tag", "on stop");
        Toast.makeText(this, "Activity stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("My_Tag", "on Restart");
        Toast.makeText(this, "Activity Restarted", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("My_Tag", "on Destroy");
        Toast.makeText(this, "Activity Destroyed", Toast.LENGTH_SHORT).show();
    }
    public void Activity2(){
        Intent i=new Intent( this, Activity2.class);
        startActivity(i);
    }

}









