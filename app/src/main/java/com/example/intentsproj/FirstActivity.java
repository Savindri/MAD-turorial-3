package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button;
    int n1,n2;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ButtonListner();
    }

    public void ButtonListner(){
        button=(Button)findViewById(R.id.button);
        et1=(EditText)findViewById(R.id.editTextTextPersonName);
        et2=(EditText)findViewById(R.id.editTextTextPersonName2);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast;
                        Context context=getApplicationContext();
                        CharSequence text="You just clicked the Ok button";
                        int duration=Toast.LENGTH_SHORT;

                        toast=Toast.makeText(context,text,duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                        toast.show();

                        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                        intent.putExtra("Number1",et1.getText().toString());
                        intent.putExtra("Number2",et2.getText().toString());
                        startActivity(intent);
                    }
                }
        );
    }

}