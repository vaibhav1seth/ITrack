package com.example.vaibhav.itrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton admin;
    private ImageButton studentbtn;
    private ImageButton faculty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        admin = (ImageButton)findViewById(R.id.admin);
        faculty = (ImageButton)findViewById(R.id.teacher);
        studentbtn = (ImageButton)findViewById(R.id.student);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Admin.class));
            }
        });

        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FacultyActivity.class));
            }
        });

        studentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,StudentActivity.class));
            }
        });

    }
}
