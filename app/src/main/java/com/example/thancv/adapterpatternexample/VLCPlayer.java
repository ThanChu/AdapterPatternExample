package com.example.thancv.adapterpatternexample;

import android.util.Log;

/**
 * Created by ThanCV on 8/8/2017.
 */

public class VLCPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        Log.e("VLC", "Play VLC " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
        //Do nothing
    }
}
