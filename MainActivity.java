package com.example.ksb.userdetails;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends Activity {

    private Spinner spinner1;
    private Button btnSubmit;
    private CheckBox c1;
    private RadioButton r1;
    public RadioGroup gr;
    EditText name,email;

    int selectid;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        gr=(RadioGroup)(findViewById(R.id.grp));

    }

    public void addListenerOnButton()
    {
        spinner1 = (Spinner) findViewById(R.id.spinner);
        btnSubmit = (Button) findViewById(R.id.button);
        c1=(CheckBox)(findViewById(R.id.checkBox));
        name=(EditText)(findViewById(R.id.editText));
        email=(EditText)(findViewById(R.id.editText2));
        btnSubmit.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v) {
                selectid=gr.getCheckedRadioButtonId();
                r1=(RadioButton)(findViewById(selectid));

                if (v == btnSubmit) {

                    if (name.getText().toString().trim().length()==0||email.getText().
                            toString().trim().length()==0)
                    {
                        showMessage("ERROR","Please Enter all fields");
                        return;
                    }
                    else if (c1.isChecked())
                    {
                        String msg;
                        msg="NAME :" + name.getText().toString() + " EMAIL :"
                                + email.getText().toString() +"  Subject : "
                                +spinner1.getSelectedItem()+"  Gender : "+r1.getText();
                        showMessage("Sucess",msg);

                    }
                    else
                    {
                        showMessage("Error","Select the checkBox");
                        return;
                    }

                }
            }



        });
    }
    public void showMessage(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}