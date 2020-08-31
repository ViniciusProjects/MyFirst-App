package com.cursoandroid.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void draw (View view) {
        TextView tv = findViewById(R.id.textResult);
      int randomNumber = new Random().nextInt(11);
        tv.setText("Generated Number:" + randomNumber);
      }
    }


