package com.example.humbert.powerbuilding;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView welcome = (TextView) findViewById(R.id.welcome);
        ImageView icono = (ImageView) findViewById(R.id.icon);



    }
    public void onClick(View v){
        Button start = (Button) findViewById(R.id.btn_start);
        Intent intent = new Intent(Welcome.this, QuestionOne.class);
        startActivity(intent);
    }

}
