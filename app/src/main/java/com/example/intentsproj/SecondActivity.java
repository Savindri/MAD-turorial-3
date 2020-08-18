package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int n1,n2;
    EditText et1,et2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=(TextView)findViewById(R.id.editTextTextPersonName3);
        Button button1=(Button)findViewById(R.id.buttonAdd);
        Button button2=(Button)findViewById(R.id.buttonSub);
        Button button3=(Button)findViewById(R.id.buttonDiv);
        Button button4=(Button)findViewById(R.id.buttonMul);

        et1=(EditText)findViewById(R.id.editTextTextPersonName);
        et2=(EditText)findViewById(R.id.editTextTextPersonName2);

        Intent intent=getIntent();

        String num1 = intent.getStringExtra("Number1");
        String num2 = intent.getStringExtra("Number2");

        et1.setText(num1);
        et2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(n1+"+"+n2+"="+(n1+n2));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(n1+"-"+n2+"="+(n1-n2));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(n1+"/"+n2+"="+(n1/n2));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(n1+"*"+n2+"="+(n1*n2));
            }
        });

    }
}