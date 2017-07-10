package com.example.humbert.powerbuilding;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionOne extends AppCompatActivity implements View.OnClickListener{
    Button male,female;
    TextView question;
    Person p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);
        p = new Person();
        question = (TextView) findViewById(R.id.question);
        male = (Button) findViewById(R.id.btn_male);
        female = (Button) findViewById(R.id.btn_female);
        male.setOnClickListener(this);
        female.setOnClickListener(this);

    }
            public void onClick(View v) {

              switch(v.getId()){
                  case R.id.btn_male:
                      p.setGender(true);
                      break;
                  case R.id.btn_female:
                      p.setGender(false);
                      break;
              }
                Intent intent = new Intent(QuestionOne.this, QuestionTwo.class);
                intent.putExtra("person", (Parcelable) p);
                startActivity(intent);



            }



    }
