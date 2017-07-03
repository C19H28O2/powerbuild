package com.example.humbert.powerbuilding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class QuestionOne extends AppCompatActivity {
    ImageButton male,female;
    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);
        question = (TextView) findViewById(R.id.question);
    }

    public void onClick(View v){

        male = (ImageButton) findViewById(R.id.btn_male);
        female= (ImageButton) findViewById(R.id.btn_female);
        Intent intent= new Intent(QuestionOne.this, QuestionTwo.class);
        startActivity(intent);
    }
}
