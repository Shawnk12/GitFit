package com.example.shawnkrishnan.gitfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;
import android.appwidget.*;
import java.lang.*;



public class FitActivity extends AppCompatActivity {


       public Button but1;


       public void init() {

           but1 = (Button)findViewById(R.id.button);
           but1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

                   Intent toy = new Intent(FitActivity.this, LoginActivity.class);

                   startActivity(toy);
               }
           });


       }

           @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fit);
               init();


    }






    }


