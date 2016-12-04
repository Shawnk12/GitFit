package com.example.shawnkrishnan.gitfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.*;
import android.view.*;
import java.lang.*;
import android.support.v7.widget.AppCompatImageView;


public class InputActivity extends AppCompatActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        final EditText weight = (EditText) findViewById(R.id.editText7);

        final EditText height = (EditText) findViewById(R.id.editText5);

        final TextView bmi = (TextView) findViewById(R.id.result);

        final Button sumComp = (Button) findViewById(R.id.sum);

        sumComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int w = Integer.parseInt(weight.getText().toString().trim());
                int h = Integer.parseInt(height.getText().toString().trim());


                double lol = (w / (Math.pow(h, 2))) * 703;

                bmi.setText(" Your BMI is : " + lol);
            }


        });

    }
}
