package com.example.cse486.uniclubz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    UserPref userPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userPref = new UserPref(getApplicationContext());

        if(!userPref.isLoggedIn())
        {

        }
        else
        {

        }
    }

    public void tolauncher(View view) {
            //Firebase Logout
            FirebaseAuth.getInstance().signOut();
            userPref.setLogin(false);
            Intent intent = new Intent(getApplicationContext(),LauncherActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            finish();
            startActivity(intent);


    }

    public void allclubs(View view) {
        Intent intent = new Intent(getApplicationContext(),ClubListActivity.class);
        startActivity(intent);
    }

    public void events(View view) {
        Intent intent = new Intent(getApplicationContext(),EventListActivity.class);
        startActivity(intent);
    }

    public void bd(View view) {
        Intent intent = new Intent(getApplicationContext(),BloodDonationListActivity.class);
        startActivity(intent);
    }

    public void profile(View view) {
        Intent intent = new Intent(getApplicationContext(),Profile.class);
        startActivity(intent);
    }

    public void clubadmin(View view) {
        Intent intent = new Intent(getApplicationContext(),ClubAdminActivity.class);
        startActivity(intent);
    }

    public void myclubs(View view) {
        Intent intent = new Intent(getApplicationContext(),ClubListActivity.class);
        startActivity(intent);
    }
}