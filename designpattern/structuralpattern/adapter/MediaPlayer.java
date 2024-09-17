package designpattern.structuralpattern.adapter;

//Target interface : interface that the client expects to work with
public interface MediaPlayer {

    //the interface that the client knows and uses to play media. It only has one method: play()
    void play(String audioType,String filename);
}
