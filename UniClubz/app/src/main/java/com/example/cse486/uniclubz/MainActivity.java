package com.example.cse486.uniclubz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserPref userPref = new UserPref(getApplicationContext());

        if(!userPref.isLoggedIn())
        {

        }
        else
        {

        }
    }
}