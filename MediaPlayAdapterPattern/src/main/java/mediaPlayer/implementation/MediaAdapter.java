package mediaPlayer.implementation;

import advancedMediaPlayer.AdvancedMediaPlayer;
import advancedMediaPlayer.implementation.Mp4Player;
import advancedMediaPlayer.implementation.VlcPlayer;
import mediaPlayer.MediaPlayer;

/**
 * Created by ALEX on 08/11/2015.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public String play(String type)throws Exception{
        if(type.equals("mp4")){
            advancedMediaPlayer= new Mp4Player();
            return advancedMediaPlayer.playMp4(type);
        }
        else if(type.equals("vlc")){
            advancedMediaPlayer= new VlcPlayer();
            return advancedMediaPlayer.playVlc(type);
        }
        else
            throw new java.lang.Exception("Not supported file");
    }

}
