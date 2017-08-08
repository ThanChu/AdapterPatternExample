package com.example.thancv.adapterpatternexample;

import android.util.Log;

/**
 * Created by ThanCV on 8/8/2017.
 */

public class MP4Player implements AdvanceMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        //Do nothing
    }

    @Override
    public void playMP4(String fileName) {
        Log.e("VLC", "Play MP4 " + fileName);
    }
}
