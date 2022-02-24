package com.example.navigation_25;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClick(View view) {

        Intent myIntent=null;

        switch (view.getId()){
            case R.id.btnBack:
                myIntent=new Intent(MainActivity2.this,MainActivity.class);
                break;

            case R.id.btnNext:
                myIntent=new Intent(MainActivity2.this,MainActivity3.class);
                break;
        }
        startActivity(myIntent);
    }
}