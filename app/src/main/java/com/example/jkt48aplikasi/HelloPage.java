package com.example.jkt48aplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HelloPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_page);
    }

    public void PINDAH(View view) {
        Intent intent = new Intent(HelloPage.this,MainActivity.class);
        startActivity(intent);
    }
}