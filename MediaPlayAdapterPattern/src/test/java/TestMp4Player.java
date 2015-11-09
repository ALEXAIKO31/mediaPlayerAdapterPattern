import advancedMediaPlayer.AdvancedMediaPlayer;
import advancedMediaPlayer.implementation.Mp4Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 08/11/2015.
 */
public class TestMp4Player {

    AdvancedMediaPlayer advancedMediaPlayer;

    @Before
    public void setUp(){
        advancedMediaPlayer = new Mp4Player();
    }

    @Test
    public void testPlayMp4File(){
        assertEquals(advancedMediaPlayer.playMp4("mp4"),"Playing a mp4 file");
    }

    @Test
    public void testPlayVlcFile(){
        assertEquals(advancedMediaPlayer.playVlc("vlc"),null);
    }
}
