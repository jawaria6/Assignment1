package com.example.mcsf19m006_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.v);
        imageView.setImageResource(R.drawable.kids);


    }


    public void Move(View view) {
        Intent intent=new Intent(this,EngAlphabets.class);
        startActivity(intent);
    }
    public void MoveToPiano(View view) {
        Intent intent=new Intent(this,AnimalPiano.class);
        startActivity(intent);
    }
}