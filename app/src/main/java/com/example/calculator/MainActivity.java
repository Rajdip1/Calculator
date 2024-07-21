package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNumber1, etNumber2;
        Button btnAddition, btnSubtraction, btnMultiplication, btnDivision;

        etNumber1 = findViewById(R.id.etNum1);
        etNumber2 = findViewById(R.id.etNum2);
        btnAddition = findViewById(R.id.btnAdd);
        btnSubtraction = findViewById(R.id.btnSub);
        btnMultiplication = findViewById(R.id.btnMul);
        btnDivision = findViewById(R.id.btnDiv);


        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etNumber1.getText().toString();
                String value2 = etNumber2.getText().toString();

                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a+b;

                String messege = "Sum is " + sum;

                Toast.makeText(getApplicationContext(),messege, Toast.LENGTH_LONG).show();
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etNumber1.getText().toString();
                String value2 = etNumber2.getText().toString();

                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a-b;

                String messege = "Sum is " + sum;

                Toast.makeText(getApplicationContext(),messege, Toast.LENGTH_LONG).show();
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etNumber1.getText().toString();
                String value2 = etNumber2.getText().toString();

                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a*b;

                String messege = "Sum is " + sum;

                Toast.makeText(getApplicationContext(),messege, Toast.LENGTH_LONG).show();
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = etNumber1.getText().toString();
                String value2 = etNumber2.getText().toString();

                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);
                int sum = a/b;

                String messege = "Sum is " + sum;

                Toast.makeText(getApplicationContext(),messege, Toast.LENGTH_LONG).show();
            }
        });
    }
}