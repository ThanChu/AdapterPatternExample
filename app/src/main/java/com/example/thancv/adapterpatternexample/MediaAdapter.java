package com.example.thancv.adapterpatternexample;

/**
 * Created by ThanCV on 8/8/2017.
 */

public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer advanceMediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advanceMediaPlayer = new VLCPlayer();
            advanceMediaPlayer.playVLC(fileName);
        } else {
            advanceMediaPlayer = new MP4Player();
            advanceMediaPlayer.playMP4(fileName);
        }
    }
}
