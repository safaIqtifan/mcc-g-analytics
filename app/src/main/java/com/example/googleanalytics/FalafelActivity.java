package com.example.googleanalytics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FalafelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falafel);

        RootApplication.screenView("g", "ElectronicProductsActivity");
    }
}