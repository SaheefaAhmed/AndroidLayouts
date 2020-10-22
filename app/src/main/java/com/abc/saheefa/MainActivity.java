package com.abc.saheefa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLinear=findViewById(R.id.btn1);
        Button btnRelative=findViewById(R.id.btn2);
        Button btnTable=findViewById(R.id.btn3);
        Button btnAbsolute=findViewById(R.id.btn4);
        Button btnFrame=findViewById(R.id.btn5);




        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(i);
            }
        });
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(i);
            }
        });
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(i);
            }
        });
        btnAbsolute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AbsoluteLayoutActivity.class);
                startActivity(i);
            }
        });
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FrameLayoutActivity.class);
                startActivity(i);
            }
        });


    }
}