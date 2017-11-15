package com.example.spc26.rate_ing_bathroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by spc26 on 11/15/2017.
 */

public class LoginOptionsActivity extends WelcomeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginoptions);
    }

    public void buildingSelection(View view){
        Intent intent = new Intent(this, BuildingSelectionActivity.class);
        startActivity(intent);
    }

    public void userLogin(View view){
        Intent intent = new Intent(this, UserLoginActivity.class);
        startActivity(intent);
    }

}
