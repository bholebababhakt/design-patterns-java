package designpattern.structuralpattern.adapter.advancemediaplayer;

//Concrete Adaptees
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {
        System.out.println("playing Mp4 file: "+filename);
    }

    @Override
    public void playVlc(String filename) {
        // Do nothing, MP4 player can't play VLC
        System.out.println("will handle this type in different design pattern or solid principle");
    }
}
