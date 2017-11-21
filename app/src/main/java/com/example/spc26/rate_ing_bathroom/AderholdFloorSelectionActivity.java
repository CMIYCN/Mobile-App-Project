package com.example.spc26.rate_ing_bathroom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by spc26 on 11/20/2017.
 */

public class AderholdFloorSelectionActivity extends AppCompatActivity {

    Button floorC, floor1, floor2, floor3, floor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aderhold_floorselection);
        floorC = (Button) findViewById(R.id.button_floor_c);
        floor1 = (Button) findViewById(R.id.button_floor_one);
        floor2 = (Button) findViewById(R.id.button_floor_two);
        floor3 = (Button) findViewById(R.id.button_floor_three);
        floor4 = (Button) findViewById(R.id.button_floor_four);

        floorC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

    }
}
