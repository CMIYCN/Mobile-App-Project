package com.example.spc26.rate_ing_bathroom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by spc26 on 11/20/2017.
 */

public class SignUpActivity extends AppCompatActivity {

    Button signUp;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signUp = (Button) findViewById(R.id.button_signup);
        toast = Toast.makeText(getApplicationContext(), "Congratulations!!! You've successfully registered an account", Toast.LENGTH_LONG);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toast.show();
                startActivity(new Intent(getApplicationContext(), UserLoginActivity.class));
            }
        });
    }
}
