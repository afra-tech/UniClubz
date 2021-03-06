package com.example.cse486.uniclubz.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cse486.uniclubz.R;
import com.example.cse486.uniclubz.ViewModel.UserPref;
import com.example.cse486.uniclubz.databinding.ActivityLauncherBinding;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        UserPref userPref = new UserPref(getApplicationContext());
        //userPref.setLogin(false); //for testing set true
        if(userPref.isLoggedIn())
        {
            //Go to Main Activity if User already logged in
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            finish();
            startActivity(intent);
        }
        else
        {
            ActivityLauncherBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_launcher);
            binding.launchSignup.setVisibility(View.VISIBLE);
            binding.launchLogin.setVisibility(View.VISIBLE);
        }

    }

    // Go to Sign Up Screen
    public void signup(View view) {

        Intent intent = new Intent(getApplicationContext(),Signup.class);
        startActivity(intent);
    }

    // Go to Login Screen
    public void login(View view) {
        Intent intent = new Intent(getApplicationContext(),Login.class);
        startActivity(intent);
    }
}