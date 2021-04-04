package com.example.googleanalytics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElectronicProductsActivity extends AppCompatActivity {

    Button laptop;
    Button iphone;
    Button smartTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic_products);

        laptop = findViewById(R.id.button);
        iphone = findViewById(R.id.button2);
        smartTv = findViewById(R.id.button3);

        RootApplication.screenView("d", "ElectronicProductsActivity");

        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RootApplication.buttonClicked("11", "laptop Button clicked");
                startActivity( new Intent(getApplicationContext(), LaptopHpActivity.class));
            }
        });

        iphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RootApplication.buttonClicked("12", "iphone Button clicked");
                startActivity( new Intent(getApplicationContext(), IphoneXActivity.class));
            }
        });

        smartTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RootApplication.buttonClicked("13", "smartTv Button clicked");
                startActivity( new Intent(getApplicationContext(), SmartTvActivity.class));
            }
        });
    }
}