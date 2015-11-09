package mediaPlayer.implementation;

import mediaPlayer.MediaPlayer;

/**
 * Created by ALEX on 08/11/2015.
 */
public class AudioPlayer implements MediaPlayer {

    private MediaPlayer mediaPlayer;

    public AudioPlayer(){
        mediaPlayer = new MediaAdapter();
    }

    public String play(String type)throws Exception{
        if(type.equals("mp3"))
            return "Playing a mp3 file";
        else {
            return mediaPlayer.play(type);
        }
    }

}
