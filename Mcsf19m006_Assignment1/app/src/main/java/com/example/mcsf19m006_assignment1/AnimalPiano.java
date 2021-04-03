package com.example.mcsf19m006_assignment1;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class AnimalPiano extends AppCompatActivity {

    GridView gridView;
    MediaPlayer player;

    int [] animals={R.drawable.cat,R.drawable.dog2,R.drawable.lion,R.drawable.goat,R.drawable.gorilla};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_piano);
        gridView=(GridView)findViewById(R.id.g);
        CustomAdapter customAdapter =new CustomAdapter(getApplicationContext(),animals);
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        if(player!=null) {
                            player.stop();
                            player.release();
                        }
                        player=MediaPlayer.create(AnimalPiano.this,R.raw.cat);
                        player.start();
                        break;
                    case 1:
                        if(player!=null) {
                            player.stop();
                            player.release();
                        }
                        player=MediaPlayer.create(AnimalPiano.this,R.raw.dog);
                        player.start();
                        break;
                    case 2:
                        if(player!=null) {
                            player.stop();
                            player.release();
                        }
                        player=MediaPlayer.create(AnimalPiano.this,R.raw.lion);
                        player.start();
                        break;
                    case 3:
                        if(player!=null) {
                            player.stop();
                            player.release();
                        }
                        player=MediaPlayer.create(AnimalPiano.this,R.raw.goat);
                        player.start();
                        break;
                    case 4:
                        if(player!=null) {
                            player.stop();
                            player.release();
                        }
                        player=MediaPlayer.create(AnimalPiano.this,R.raw.gorila);
                        player.start();
                        break;

                }


            }
        });

    }
}