import mediaPlayer.MediaPlayer;
import mediaPlayer.implementation.AudioPlayer;

/**
 * Created by ALEX on 08/11/2015.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        MediaPlayer mediaPlayer;
        mediaPlayer = new AudioPlayer();

        try{
            System.out.println(mediaPlayer.play("mp3"));
            System.out.println(mediaPlayer.play("mp4"));
            System.out.println(mediaPlayer.play("vlc"));
            System.out.println(mediaPlayer.play("mp2"));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}
