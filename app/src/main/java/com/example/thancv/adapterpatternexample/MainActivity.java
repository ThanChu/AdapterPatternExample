package com.example.thancv.adapterpatternexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaAdapter mediaAdapter = new MediaAdapter();
        mediaAdapter.play("vlc", "than1.vlc");
        mediaAdapter.play("mp4", "than2.vlc");
        mediaAdapter.play("mp4", "than3.vlc");
        mediaAdapter.play("vlc", "than4.vlc");
    }
}
