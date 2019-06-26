package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CountryListActivity extends AppCompatActivity {
  ListView lv;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_country_list);
    lv = findViewById(R.id.list);
    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch(i){
          case 0:
            startActivity(new Intent(CountryListActivity.this, IndiaActivity.class)); break;
          case 1:
            startActivity(new Intent(CountryListActivity.this, ChinaActivity.class)); break;
          case 2:
            startActivity(new Intent(CountryListActivity.this, BangladeshActivity.class)); break;
            case 3:
              startActivity(new Intent(CountryListActivity.this, NepalActivity.class)); break;
              case 4:
                startActivity(new Intent(CountryListActivity.this, SriLankaActivity.class)); break;
        }
      }
    });
  }
}
