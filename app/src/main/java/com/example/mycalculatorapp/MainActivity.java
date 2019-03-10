package com.example.mycalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {


    Button add,sub,divide,multiply;
    EditText first,second,result;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=(Button)findViewById(R.id.btnadd);
        sub=(Button)findViewById(R.id.btnsub);
        multiply=(Button)findViewById(R.id.btnmul);
        divide=(Button)findViewById(R.id.btndiv);
        first=(EditText)findViewById(R.id.eone);
        second=(EditText)findViewById(R.id.etwo);
        result=(EditText)findViewById(R.id.ethree);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().equals("")|| second.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(),"Number missing",Toast.LENGTH_LONG).show();

                }

                else{
                    double num1=Double.valueOf(first.getText().toString());
                    double num2=Double.valueOf(second.getText().toString());

                    double num3=num1+num2;
                    DecimalFormat dc=new DecimalFormat("#0.00");


                    result.setText((dc.format(num3)));

                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().equals("")||second.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(),"Number missing ",Toast.LENGTH_LONG).show();

                }

                else{
                    double num1=Double.valueOf(first.getText().toString());
                    double num2=Double.valueOf(second.getText().toString());

                    double num3=num1-num2;

                    DecimalFormat dc=new DecimalFormat("#0.00");

                    result.setText(dc.format(num3));

                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                if(first.getText().toString().equals("")||second.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(),"Number missing",Toast.LENGTH_LONG).show();

                }

                else{

                    double num1=Double.valueOf(first.getText().toString());
                    double num2=Double.valueOf(second.getText().toString());

                    double num3=num1*num2;

                    DecimalFormat dc=new DecimalFormat("#0.00");

                    result.setText(dc.format(num3));




                }


            }
        });

        divide.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                if(first.getText().toString().equals("")|| second.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(),"Number missing",Toast.LENGTH_LONG).show();
                }

                else{
                    double num1=Double.valueOf(first.getText().toString());
                    double num2=Double.valueOf(second.getText().toString());

                    if(num2==0){
                        Toast.makeText(getApplicationContext(),"Cannot divide by zero",Toast.LENGTH_LONG).show();
                    }
                    else{
                        double num3=num1/num2;

                        DecimalFormat dc=new DecimalFormat("#0.00");

                        result.setText(dc.format(num3));



                    }

                }


            }


        });

    }
}
