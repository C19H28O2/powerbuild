package com.example.humbert.powerbuilding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_own_workout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_own_workout = (Button) findViewById(R.id.btn_introduce_workout);
        btn_own_workout.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn_introduce_workout:
                Intent intent = new Intent(MainActivity.this, IntroduceWorkout.class);
                startActivity(intent);
        }
    }
}
