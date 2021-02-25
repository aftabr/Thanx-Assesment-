package com.example.finalexamadditionmultiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add;
    Button subtract;
    Button division;
    Button multiplication;
    EditText value1;
    EditText value2;
    TextView calculation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.addBtn);
        subtract = findViewById(R.id.subBtn);
        division = findViewById(R.id.divBtn);
        multiplication = findViewById(R.id.mulBtn);
        value1 = findViewById(R.id.firstValue);
        value2 = findViewById(R.id.secondValue);
        calculation = findViewById(R.id.calculation);

        // adding the function
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstnum =new Integer (value1.getText().toString());
                int secondnum =new Integer (value2.getText().toString());
                int sum = firstnum + secondnum;

                calculation.setText("The sum addition of " +firstnum +" + "+secondnum+"="+ sum);
            }
        });
        // subtractig the function
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstnum =new Integer (value1.getText().toString());
                int secondnum =new Integer (value2.getText().toString());
                int sum = firstnum - secondnum;
                calculation.setText("The sum subtraction of " +firstnum +" - "+secondnum+"="+ sum);
            }
        });
         // divising the function
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstnum =new Integer (value1.getText().toString());
                int secondnum =new Integer (value2.getText().toString());
                int sum = firstnum / secondnum;
                calculation.setText("The sum division of " +firstnum +" / "+secondnum+"="+ sum);
            }
        });
        // multiplying the function
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstnum =new Integer (value1.getText().toString());
                int secondnum =new Integer (value2.getText().toString());
                int sum = firstnum * secondnum;
                calculation.setText("The sum multiplication of " +firstnum +" * "+secondnum+"="+ sum);
            }
        });

    }
}
