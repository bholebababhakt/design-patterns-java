package designpattern.structuralpattern.adapter;

import designpattern.structuralpattern.adapter.advancemediaplayer.AdvancedMediaPlayer;
import designpattern.structuralpattern.adapter.advancemediaplayer.Mp4Player;
import designpattern.structuralpattern.adapter.advancemediaplayer.VlcPlayer;

/*
Adapter
It adapts the AdvancedMediaPlayer to the MediaPlayer interface.
This is the middleman that helps connect the client (AudioPlayer) with the advanced backend systems (like MP4 and VLC players).
It allows the Mp3Player (which only plays MP3s) to also handle MP4 and VLC files by adapting the AdvancedMediaPlayer classes.
*/
public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    // Based on the audio type, we'll use either Mp4Player or VlcPlayer
    public MediaAdapter(String audiotype){
        if(audiotype.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
        else if(audiotype.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }
    }
    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(filename);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(filename);
        }
    }
}
