package com.example.vaibhav.itrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        Intent i =  getIntent();
        Bundle b = i.getBundleExtra("personb");
        String email_d = b.getString("email");
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Welcome  " + email_d);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
