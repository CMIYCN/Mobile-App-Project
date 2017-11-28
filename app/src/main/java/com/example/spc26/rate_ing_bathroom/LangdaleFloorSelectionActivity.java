package com.example.spc26.rate_ing_bathroom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by spc26 on 11/20/2017.
 */

public class LangdaleFloorSelectionActivity extends AppCompatActivity {

    Button floorOne, floorTwo, floorThree, floorFour, floorFive, floorSix, floorSeven, floorEight;
    Button floorNine, floorTen;

    @Override
    protected void onCreate(Bundle savedInstance) {


        super.onCreate(savedInstance);
        setContentView(R.layout.activity_langdale_floorselection);
        floorOne = (Button) findViewById(R.id.floor_one_button);
        floorTwo = (Button) findViewById(R.id.floor_one_button2);
        floorThree = (Button) findViewById(R.id.floor_one_button3);
        floorFour = (Button) findViewById(R.id.floor_one_button4);
        floorFive = (Button) findViewById(R.id.floor_one_button5);
        floorSix = (Button) findViewById(R.id.floor_one_button6);
        floorSeven = (Button) findViewById(R.id.floor_one_button7);
        floorEight = (Button) findViewById(R.id.floor_one_button8);
        floorNine = (Button) findViewById(R.id.floor_one_button9);
        floorTen = (Button) findViewById(R.id.floor_one_button10);

        floorOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floorTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floorThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floorFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floorFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floorSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floorSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floorEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floorNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });

        floorTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SelectBathroomActivity.class));
            }
        });
    }
}
