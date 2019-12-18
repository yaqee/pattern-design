package struction.adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        } else if("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(filename);
        } else if("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(filename);
        }
    }
}
