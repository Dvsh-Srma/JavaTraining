package com.example.intentsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button dial, next;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    dial = findViewById(R.id.button1);
    next = findViewById(R.id.button2);

    dial.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent n = new Intent(Intent.ACTION_DIAL);
        startActivity(n);
      }
    });
    next.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(new Intent(MainActivity.this, NextActivity.class));
      }
    });
  }

}
