package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username, password;
Button submit;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    username = findViewById(R.id.editTextUsername);
    password = findViewById(R.id.editTextPassword);
    submit = findViewById(R.id.buttonSubmit);
    submit.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
          startActivity(new Intent(MainActivity.this, CountryListActivity.class));
        } else {
          Toast.makeText(MainActivity.this, "Incorrect Credentials", Toast.LENGTH_SHORT).show();
        }
      }
    });
  }
}
