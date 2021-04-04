package com.example.googleanalytics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodProductsActivity extends AppCompatActivity {

    Button Pizza;
    Button Pastries;
    Button Falafel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_products);

        Pizza = findViewById(R.id.button);
        Pastries = findViewById(R.id.button2);
        Falafel = findViewById(R.id.button3);

        RootApplication.screenView("b", "FoodProductsActivity");

        Pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RootApplication.buttonClicked("5", "Pizza Button clicked");
                startActivity( new Intent(getApplicationContext(), PizzaActivity.class));
            }
        });

        Pastries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RootApplication.buttonClicked("6", "pastries Button clicked");
                startActivity( new Intent(getApplicationContext(), PastriesActivity.class));
            }
        });

        Falafel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RootApplication.buttonClicked("7", "Falafel Button clicked");
                startActivity( new Intent(getApplicationContext(), FalafelActivity.class));
            }
        });
    }
}