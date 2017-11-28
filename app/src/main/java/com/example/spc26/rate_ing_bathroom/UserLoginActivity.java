package com.example.spc26.rate_ing_bathroom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//import android.widget.EditText;

/**
 * Created by spc26 on 11/15/2017.
 */

public class UserLoginActivity extends AppCompatActivity {

    EditText username, password ;
    Button userLogin, signUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);
        username = (EditText) findViewById(R.id.textUsername);
        password = (EditText) findViewById(R.id.textPassword);
        userLogin = (Button)findViewById(R.id.buttonLogin);
        signUp = (Button) findViewById(R.id.buttonSignup);
        final Toast toast = Toast.makeText(getApplicationContext(), "Username and Password don't exist", Toast.LENGTH_LONG);
//        final Toast toast2 = Toast.makeText(getApplicationContext(), "Please enter the username and password", Toast.LENGTH_LONG);

        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("User0001") && password.getText().toString().equals("Pass0001")){
                    startActivity(new Intent(getApplicationContext(), UserViewActivity.class));
                }else {
                    toast.show();
                    username.setText(" ");
                    password.setText(null);
                }
            }
        });



        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
            }
        });
    }

}
