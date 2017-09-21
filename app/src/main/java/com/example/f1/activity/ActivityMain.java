package com.example.f1.activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityMain extends AppCompatActivity {

    private int numberOfCups = 0;

    private TextView numberTV;
    private Button buttonPlus;

    // TODO: Define a private var for Button "-"
    // TODO: Define a private var for TextView "Sum"
    // TODO: Define a private var for Button "Order"

    private Button buttonPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set layout for this activity:
        setContentView(R.layout.activity_main);

        // Set my Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setIcon(R.mipmap.ic_launcher);
            actionBar.setTitle(R.string.app_name);
        }

        // Find all elements for interaction:
        numberTV = (TextView) findViewById(R.id.numberTV);      // number of coffee cups
        buttonPlus = (Button) findViewById(R.id.buttonPlus);    // plus button

        // TODO: Find the reference to the Button "-"
        // TODO: Find the reference to the TextView "Sum"
        // TODO: Find the reference to the Button "Order"

        buttonPicture = (Button) findViewById(R.id.buttonCoffee);

        // Set initial number of cups in the respective TextView to 0:
        numberTV.setText(String.valueOf(numberOfCups));

        // Set listeners on buttons (minus/plus):
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Increment the number of cups by 1:
                numberOfCups += 1;
                // Set new value to the TextView for number of cups:
                numberTV.setText(String.valueOf(numberOfCups));
            }
        });

        // TODO: Add listener to the button "-"

        // TODO: Add listener to the button "Order"
        // When the button is pressed the sum ("price per cup" times "number of cups")
        // should appear in the respective TextView

        buttonPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMain.this, ActivityPicture.class);
                startActivity(intent);
            }
        });
    }
}
