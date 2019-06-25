package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
 ListView lv;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    lv = findViewById(R.id.myList);
    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
          case 0:
            Toast.makeText(MainActivity.this, "Clicked India", Toast.LENGTH_SHORT).show(); break;
          case 1:
            Toast.makeText(MainActivity.this, "Clicked China", Toast.LENGTH_SHORT).show(); break;
          case 2:
            Toast.makeText(MainActivity.this, "Clicked Bangladesh", Toast.LENGTH_SHORT).show(); break;
          case 3:
            Toast.makeText(MainActivity.this, "Clicked Nepal", Toast.LENGTH_SHORT).show(); break;
          case 4:
            Toast.makeText(MainActivity.this, "Clicked Sri Lanka", Toast.LENGTH_SHORT).show(); break;
          case 5:
            Toast.makeText(MainActivity.this, "Clicked Pakistan", Toast.LENGTH_SHORT).show(); break;
        }
      }
    });
  }
}
