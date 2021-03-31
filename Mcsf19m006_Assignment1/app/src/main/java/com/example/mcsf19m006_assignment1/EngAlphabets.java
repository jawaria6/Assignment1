package com.example.mcsf19m006_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class EngAlphabets extends AppCompatActivity {
    MediaPlayer player;
 String [] AlphabetsPics;
    String [] Pictures;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_alphabets);


    }
    public  void play(View v){
        if(player == null){
            player=MediaPlayer.create(this,R.raw.childeren);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }
    public  void pause(View v){
        if(player!=null) {
            player.pause();
        }
    }
    public  void stop(View v){
        stopPlayer();
    }
    public  void stopPlayer(){
        if(player!=null){
            player.release();
            player=null;
            Toast.makeText(this, "MediaPlayer Realeased", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}