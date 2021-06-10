package com.example.gettingstartedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText Age;
    private EditText Weight;
    private EditText Height;
    private Switch slider;
    private Button calculate;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frindViews();
        buttonFunction();
        t1.setText("Test Done");

        Toast.makeText(this, "Welcome!!!", Toast.LENGTH_LONG).show();
    }

    private void buttonFunction() {
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Works!!!", Toast.LENGTH_LONG).show();
                calculateBmi();
            }
        });
    }

    private void calculateBmi() {
        String age = Age.getText().toString();
        String weight = Weight.getText().toString();
        String height = Height.getText().toString();
        t1.setText(age+weight+height);
    }

    private void frindViews() {
        Age = findViewById(R.id.Age);
        Weight = findViewById(R.id.Weight);
        Height = findViewById(R.id.Height);
        slider = findViewById(R.id.Slider);
        calculate = findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.t1);
    }
}