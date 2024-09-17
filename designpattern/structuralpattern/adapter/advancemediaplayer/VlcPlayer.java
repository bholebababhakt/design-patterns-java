package designpattern.structuralpattern.adapter.advancemediaplayer;

//Concrete Adaptees
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {
        //Do nothing, VLC player can't play MP4
        System.out.println("will handle this type in different design pattern or solid principle");
    }

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing Vlc file: "+ filename);
    }
}
