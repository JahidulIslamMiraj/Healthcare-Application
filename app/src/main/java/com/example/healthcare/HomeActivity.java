package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        SharedPreferences SharedPreferences = getSharedPreferences(name:"shared_prefs", context.MODE_PRIVATE);
        String username = SharedPreferences.getString(s:"username",s1:"").toString();
        Toast.makeText(getApplicationContext(),text:"Welcome "+username,Toast.LENGTH_SHORT).show();

        CardView exit = findViewById(R.id.cardExit);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                sharedpreferences.Editor editor = SharedPreferences.edit();
                editor.clear();
                editor.apply();
                startActivity(new Intent(packageContext: HomeActivity.this,LoginActivity.class));
            }
        });

        CardView findDoctor = findViewByID(R.id.cardFindDoctor);
        findDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(packageContext: HomeActivity.this,FindDoctorActivity.class));
            }
        });
    }
}


