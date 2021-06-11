package com.example.gettingstartedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText Weight;
    private EditText Height;
    private Button calculate;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        frindViews();
        buttonFunction();

        Toast.makeText(this, "Welcome!!!", Toast.LENGTH_LONG).show();
    }

    private void buttonFunction() {
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBmi();
            }
        });
    }

    private void calculateBmi() {
        float weight = Float.parseFloat(Weight.getText().toString());
        float height = Float.parseFloat(Height.getText().toString());
        height = height / 100;
        float result = weight / (height * height);
        DecimalFormat myDecimalFormat = new DecimalFormat("0.00");
        if(result<18.5 && result>0){
            t1.setText(myDecimalFormat.format(result)+" Underweight");
        }
        else if(result>=18.5&&result<=24.9){
            t1.setText(myDecimalFormat.format(result)+" Normal");
        }
        else if(result>=25&&result<=29.9){
            t1.setText(myDecimalFormat.format(result)+" Normal");
        }
        else if(result>=30){
            t1.setText(myDecimalFormat.format(result)+" Obesity");
        }
        else{
            t1.setText("ERROR !!!");
        }
    }

    private void frindViews() {
        Weight = findViewById(R.id.Weight);
        Height = findViewById(R.id.Height);
        calculate = findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.t1);
    }
}