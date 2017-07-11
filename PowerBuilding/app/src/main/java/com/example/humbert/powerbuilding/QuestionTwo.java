package com.example.humbert.powerbuilding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class QuestionTwo extends AppCompatActivity implements View.OnClickListener{
    ToggleButton weight;
    EditText weight_number;
    Button accept;
    Boolean ToggleButtonState;
    Person p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);
        weight_number = (EditText) findViewById(R.id.text_weight);
        weight = (ToggleButton) findViewById(R.id.tbtn_weight);
        weight.setOnClickListener(this);
        accept = (Button) findViewById(R.id.btn_accept);
        accept.setOnClickListener(this);
        Intent i = getIntent();
        p = (Person) i.getParcelableExtra("person");
        weight_number.setHint("Kg");

    }

            public void onClick(View v){

                switch(v.getId()){
                    case R.id.tbtn_weight:
                        if(weight.isChecked()){
                            weight_number.setHint("Kg");

                        }
                        else{
                            weight_number.setHint("Lbs");
                        }

                        break;
                    case R.id.btn_accept:
                        p.setWeight_units(weight.isChecked());
                        p.setWeight(Float.valueOf(weight_number.getText().toString()));
                        Intent intent = new Intent(QuestionTwo.this, QuestionThree.class);
                        intent.putExtra("person", (Parcelable) p);
                        startActivity(intent);

                        break;
                }

        }


    }






