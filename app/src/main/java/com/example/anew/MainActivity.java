package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    public  void clickFunction (View view){
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextPassword= findViewById(R.id.editTextPassword);
        Log.i("String",editTextName.getText().toString());
        Log.i("String", editTextPassword.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}