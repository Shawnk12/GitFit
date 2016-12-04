package com.example.shawnkrishnan.gitfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page1Activity extends AppCompatActivity {

    public Button but3;


    public void init2() {

        but3 = (Button)findViewById(R.id.p1);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy2 = new Intent(Page1Activity.this, Page2Activity.class);

                startActivity(toy2);
            }
        });


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        init2();
    }
}
