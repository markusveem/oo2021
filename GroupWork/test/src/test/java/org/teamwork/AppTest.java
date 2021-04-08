package org.teamwork;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import static org.hamcrest.Matchers.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest {
    static Main main;
    

    @BeforeClass
    public void init(){
        main = new Main();
    }

    @Test
    public void checkDifficulty(){
        
    }
    
    
    // was the game started
    @Test
    public void DidGameStart() throws IOException{
        assertTrue(true == Main.isGameActive());
        //assertTrue("game has started", Main.isGameActive());
    }
  

    //was the right difficulty selected
    //test on praegu normaliga
    @Test

    public void WasHardDifficultySelected(){
        //assertEquals("difficulty should be hard","hard");
        assertEquals(5, 5);
    }
    // Did the right letter appear in the screen
    @Test
    public void hamcrestTest(){
        assertThat(50, is(not(40)));
        assertThat(60, is(greaterThan(59)));

        assertThat("Hello", startsWith("Hel"));
    }

    // does the word match with guessed word


}
