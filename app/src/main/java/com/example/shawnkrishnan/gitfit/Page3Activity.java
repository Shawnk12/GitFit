package com.example.shawnkrishnan.gitfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page3Activity extends AppCompatActivity {

    public Button but5;


    public void init4() {

        but5 = (Button)findViewById(R.id.p3);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy4 = new Intent(Page3Activity.this, InputActivity.class);

                startActivity(toy4);
            }
        });


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        init4();
    }
}
