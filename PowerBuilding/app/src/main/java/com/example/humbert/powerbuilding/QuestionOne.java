package com.example.humbert.powerbuilding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionOne extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

        TextView question = (TextView) findViewById(R.id.question);

    }
            public void onClick(View v) {
                Button male = (Button) findViewById(R.id.btn_male);
                Button female = (Button) findViewById(R.id.btn_female);
                Intent intent = new Intent(QuestionOne.this, QuestionTwo.class);
                startActivity(intent);



            }



    }
