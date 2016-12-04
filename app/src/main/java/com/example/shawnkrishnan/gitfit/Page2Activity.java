package com.example.shawnkrishnan.gitfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2Activity extends AppCompatActivity {

    public Button but4;


    public void init3() {

        but4 = (Button)findViewById(R.id.p2);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy3 = new Intent(Page2Activity.this, Page3Activity.class);

                startActivity(toy3);
            }
        });


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        init3();
    }
}
