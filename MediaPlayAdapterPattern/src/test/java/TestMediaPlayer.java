import mediaPlayer.MediaPlayer;
import mediaPlayer.implementation.AudioPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 08/11/2015.
 */
public class TestMediaPlayer {
    private MediaPlayer mediaPlayer;

    @Before
    public void setUp() {
        mediaPlayer=new AudioPlayer();
    }

    @Test(expected=java.lang.Exception.class)
    public void testAudioPlayerNosSupportedFile()throws Exception{
        mediaPlayer.play("not a file");
    }

    @Test
    public void testAudioPlayerMp4()throws Exception{
        assertEquals(mediaPlayer.play("mp4"), "Playing a mp4 file");
    }

    @Test
    public void testAudioPlayerVlc()throws Exception{
        assertEquals(mediaPlayer.play("vlc"), "Playing a vlc file");
    }

    @Test
    public void testAudioPlayerMp3()throws Exception{
        assertEquals(mediaPlayer.play("mp3"), "Playing a mp3 file");
    }
}
