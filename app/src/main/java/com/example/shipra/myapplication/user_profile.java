package com.example.shipra.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class user_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);


        Intent in = getIntent();
        Bundle b = in.getExtras();
        String username = b.getString("username");


        TextView tv = (TextView) findViewById(R.id.user_profile);
        tv.setText("Welcome../t/t"+username+"/t/t this is your profile");
    }
}
