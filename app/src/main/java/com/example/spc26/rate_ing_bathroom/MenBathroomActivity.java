package com.example.spc26.rate_ing_bathroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by spc26 on 11/27/2017.
 */

public class MenBathroomActivity extends AppCompatActivity{

    Button submit;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menbathroom_rating);
        submit = (Button)findViewById(R.id.button_submit1);
        toast = Toast.makeText(getApplicationContext(), "Thanks for your feedback", Toast.LENGTH_LONG);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    toast.show();
            }
        });
    }
}
