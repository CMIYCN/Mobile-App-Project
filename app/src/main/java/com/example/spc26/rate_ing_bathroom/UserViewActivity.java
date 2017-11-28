package com.example.spc26.rate_ing_bathroom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by spc26 on 11/27/2017.
 */

public class UserViewActivity extends AppCompatActivity {

    Button nextButton, logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userview);
        nextButton = (Button)findViewById(R.id.button_next2);
        logoutButton = (Button)findViewById(R.id.button_logout2);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginOptionsActivity.class));
            }
        });
    }

    public void onRadioButtonClicked(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.building1:
                if(checked)
                    nextButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            startActivity(new Intent(getApplicationContext(), LangdaleFloorSelectionActivity.class));
                        }
                    });
                break;
            case R.id.building2:
                if(checked)
                    nextButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            startActivity(new Intent(getApplicationContext(), AderholdFloorSelectionActivity.class));
                        }
                    });
                break;
        }
    }
}
