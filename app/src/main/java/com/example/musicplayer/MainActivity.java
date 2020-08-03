package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    MediaPlayer music;
    Switch loopSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        music = MediaPlayer.create(this,R.raw.music);
        loopSwitch = findViewById(R.id.switch_loop);

        loopSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                music.setLooping(b);
            }
        });
    }

    public void playMusic(View v){
        music.start();
    }
    public  void pauseMusic(View v){
        if(music.isPlaying()){
            music.pause();
        }
    }
}