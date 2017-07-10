package com.example.humbert.powerbuilding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class QuestionTwo extends AppCompatActivity {
    ToggleButton weight;
    EditText weight_number;
    Button accept;
    Boolean ToggleButtonState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);

        EditText weight_number = (EditText) findViewById(R.id.text_weight);
        Button accept = (Button) findViewById(R.id.btn_accept);
    }

    //Arreglar que cuando este clicado Kg aparezca hint de Kg y viceversa con Lbs
        public void onClick(View view){
        weight = (ToggleButton) findViewById(R.id.tbtn_weight);
        if(weight.isChecked()){
            weight_number.setHint("Kg");
        }
        else{
            weight_number.setHint("Lbs");
        }
        }
    }






