package designpattern.structuralpattern.adapter;

// Existing class the client use to play Mp3 media
public class Mp3Player implements MediaPlayer {
    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3 file: " + filename);
        }
        else {
            System.out.println("Invalid media format: "+ audioType);
        }
    }
}
