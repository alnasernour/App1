package com.example.storyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.RadialGradient;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Story extends AppCompatActivity {

    RadioGroup G;
    boolean f=false;

    Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        G=findViewById(R.id.G);

    }


public void go (View view){

        switch (G.getCheckedRadioButtonId()){

            case R.id.b1:

                  intent2=new Intent(this,Story1.class);
                  startActivity(intent2);
                  f=true;
                   break;

            case R.id.b2:
                   intent2=new Intent(this,Story2.class);
                   startActivity(intent2);
                   f=true;
                   break;


            case R.id.b3:
                intent2=new Intent(this,Story3.class);
                startActivity(intent2);
                f=true;
                break;
        }
        if(f==false)
    Toast.makeText(this,"Please select story !!",Toast.LENGTH_LONG).show();
}
}
