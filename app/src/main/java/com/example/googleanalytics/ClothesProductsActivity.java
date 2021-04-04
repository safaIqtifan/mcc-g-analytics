package com.example.googleanalytics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClothesProductsActivity extends AppCompatActivity {

    Button Shirt;
    Button dress;
    Button skirt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes_products);

        Shirt = findViewById(R.id.button);
        dress = findViewById(R.id.button2);
        skirt = findViewById(R.id.button3);

        RootApplication.screenView("c", "ClothesProductsActivity");

        Shirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RootApplication.buttonClicked("8", "Shirt Button clicked");
                startActivity( new Intent(getApplicationContext(), ShirtActivity.class));
            }
        });

        dress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RootApplication.buttonClicked("9", "dress Button clicked");
                startActivity( new Intent(getApplicationContext(), dressActivity.class));
            }
        });

        skirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RootApplication.buttonClicked("10", "skirt Button clicked");
                startActivity( new Intent(getApplicationContext(), skirtActivity.class));
            }
        });
    }
}