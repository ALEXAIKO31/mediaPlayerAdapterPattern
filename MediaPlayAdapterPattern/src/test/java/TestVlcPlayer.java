import advancedMediaPlayer.AdvancedMediaPlayer;
import advancedMediaPlayer.implementation.VlcPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 08/11/2015.
 */
public class TestVlcPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    @Before
    public void setUp(){
        advancedMediaPlayer = new VlcPlayer();
    }

    @Test
    public void testPlayVlcFile(){
        assertEquals(advancedMediaPlayer.playVlc("vlc"),"Playing a vlc file");
    }

    @Test
    public void testPlayMp4File(){
        assertEquals(advancedMediaPlayer.playMp4("mp4"),null);
    }

}
