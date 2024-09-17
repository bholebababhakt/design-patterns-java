package designpattern.structuralpattern.adapter.advancemediaplayer;

// Adaptee Interface: this is backend part or interface doesn't fit with client interface, so we need Adapter
public interface AdvancedMediaPlayer {
    void playMp4(String filename);

    void playVlc(String filename);
}
