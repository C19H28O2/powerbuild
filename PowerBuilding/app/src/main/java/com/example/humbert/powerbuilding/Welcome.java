package com.example.humbert.powerbuilding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView welcome;
    ImageView icono;
    ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welcome = (TextView) findViewById(R.id.welcome);
        icono= (ImageView) findViewById(R.id.icon);



    }
    public void onClick(View v){
        btn= (ImageButton) findViewById(R.id.btnStart);
        Intent intent = new Intent(Welcome.this, QuestionOne.class);
        startActivity(intent);
    }

}
