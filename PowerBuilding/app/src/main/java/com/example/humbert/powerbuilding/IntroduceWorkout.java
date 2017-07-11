package com.example.humbert.powerbuilding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class IntroduceWorkout extends AppCompatActivity implements View.OnClickListener {
    ToggleButton monday,tuesday,wednesday,thursday,friday,saturday,sunday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce_workout);
        monday=(ToggleButton) findViewById(R.id.tbtn_monday);
        tuesday=(ToggleButton) findViewById(R.id.tbtn_tuesday);
        wednesday=(ToggleButton) findViewById(R.id.tbtn_wednesday);
        thursday=(ToggleButton) findViewById(R.id.tbtn_thursday);
        friday=(ToggleButton) findViewById(R.id.tbtn_friday);
        saturday=(ToggleButton) findViewById(R.id.tbtn_saturday);
        sunday= (ToggleButton) findViewById(R.id.tbtn_sunday);
        monday.setOnClickListener(this);
        tuesday.setOnClickListener(this);
        wednesday.setOnClickListener(this);
        thursday.setOnClickListener(this);
        friday.setOnClickListener(this);
        saturday.setOnClickListener(this);
        sunday.setOnClickListener(this);
        
    }
<<<<<<< HEAD
    public void onClick(View v){

=======
    //Saber que dia está clicado + switch
>>>>>>> master

    }

}
