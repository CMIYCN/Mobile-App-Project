package com.example.spc26.rate_ing_bathroom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by spc26 on 11/15/2017.
 */

public class LoginOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginoptions);

        Button userLogin = (Button) findViewById(R.id.bt_lginUser);
        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), UserLoginActivity.class));
            }
        });

        Button guestLogin = (Button) findViewById(R.id.bt_lginGuest);
        guestLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BuildingSelectionActivity.class));
            }
        });

        Button adminLogin = (Button) findViewById(R.id.bt_lginAdmin);
        adminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AdminLoginActivity.class));
            }
        });
    }

}
