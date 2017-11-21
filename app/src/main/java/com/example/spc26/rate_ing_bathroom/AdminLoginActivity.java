package com.example.spc26.rate_ing_bathroom;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by spc26 on 11/16/2017.
 */

public class AdminLoginActivity extends AppCompatActivity {

    EditText adminUser, adminPd;
    Button adminLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
        adminUser = (EditText) findViewById(R.id.eTadUsername);
        adminPd = (EditText) findViewById(R.id.eTadPassword);
        adminLogin = (Button) findViewById(R.id.buttonLogin2);
        final Toast toast = Toast.makeText(getApplicationContext(), "Username and password don't exist", Toast.LENGTH_LONG);

        adminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(adminUser.getText().toString().equals("Admin") && adminPd.getText().toString().equals("Password")){
                    startActivity(new Intent(getApplicationContext(), AdminViewActivity.class));
                }else{
                    toast.show();
                }
            }
        });
    }
}
