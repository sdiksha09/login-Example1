package com.example.shipra.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    // User name
    private EditText et_Username;
    // Password
    private EditText et_Password;
    // Sign In
    private Button bt_SignIn;
    // Message
    private TextView tv_Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization
        et_Username = (EditText) findViewById(R.id.et_Username);
        et_Password = (EditText) findViewById(R.id.et_Password);
        bt_SignIn = (Button) findViewById(R.id.bt_SignIn);
        tv_Message = (TextView) findViewById(R.id.tv_Message);

        bt_SignIn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                // Stores User name
                String username = String.valueOf(et_Username.getText());
                // Stores Password
                String password = String.valueOf(et_Password.getText());

                // Validates the User name and Password for admin, admin
                if (username.equals("diksha_09") && password.equals("12345")) {
                   // tv_Message.setText("Login Successful!");

                    Toast.makeText(getApplicationContext(), "login successful...!",
                            Toast.LENGTH_SHORT).show();

                    Intent in = new Intent(getApplicationContext(),
                            user_profile.class);
                    in.putExtra("username", username);

                    startActivity(in);



                } else {

                    Toast.makeText(getApplicationContext(), "oops login unsuccessful...! please try again",
                            Toast.LENGTH_SHORT).show();


                    //tv_Message.setText("Login Unsuccessful!");
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

}
