package com.example.humbert.powerbuilding;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

public class QuestionThree extends AppCompatActivity implements View.OnClickListener {
    ToggleButton height;
    EditText height_number;
    Person p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);
        height = (ToggleButton) findViewById(R.id.tbtn_weight);
        height.setOnClickListener(this);
        height_number = (EditText) findViewById(R.id.text_height);
        Intent intent= getIntent();
        p = (Person) intent.getParcelableExtra("person");
        height_number.setHint("cm");
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.tbtn_weight:
                if(height.isChecked()){
                    height_number.setHint("cm");

                }
                else{
                    height_number.setHint("ft/in");
                }

                break;
            case R.id.btn_accept:
                p.setHeight_units(height.isChecked());
                p.setHeight(Float.valueOf(height_number.getText().toString()));
                Intent intent = new Intent(QuestionThree.this, QuestionFour.class);
                intent.putExtra("person", (Parcelable) p);
                startActivity(intent);

                break;
        }

    }
}
