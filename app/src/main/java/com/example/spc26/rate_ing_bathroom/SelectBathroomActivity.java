package com.example.spc26.rate_ing_bathroom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by spc26 on 11/20/2017.
 */

public class SelectBathroomActivity extends AppCompatActivity {

    Button menBathroom, womenBathroom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bathroom);
        menBathroom = (Button)findViewById(R.id.button_men);
        womenBathroom = (Button) findViewById(R.id.button_women);

        menBathroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MenBathroomActivity.class));
            }
        });

        womenBathroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), WomenBathroomActivity.class));
            }
        });
    }
}
