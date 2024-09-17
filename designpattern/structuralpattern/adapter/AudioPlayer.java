package designpattern.structuralpattern.adapter;

/*Client
 this is our main media player. It can play MP3 files directly, but for MP4 and VLC files, it uses the MediaAdapter to handle them.
*/
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3: " +filename);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }else {
            System.out.println("Invalid media player");
        }

    }
}
