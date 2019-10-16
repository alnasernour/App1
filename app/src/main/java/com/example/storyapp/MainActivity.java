package com.example.storyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.name);
        t2=findViewById(R.id.pass);
    }



    public void next (View view){

        if(t1.getText().toString().equals("") || t2.getText().toString().equals(""))
            Toast.makeText(this,"Please check your Email or Password !!",Toast.LENGTH_LONG).show();


        else {
            Intent intent = new Intent(this, Story.class);
            startActivity(intent);
        }
    }
}
