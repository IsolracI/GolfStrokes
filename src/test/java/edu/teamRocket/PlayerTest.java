package edu.teamRocket;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    Player player;

    @BeforeEach
    void setUp() {
        player = new Player("MJ", (byte) 0);
    }

    @Test
    void testGetInitials() {
        String expected = "MJ";
        String actualInitials = player.getInitials();
        assertEquals(expected, actualInitials);
    }

    @Test
    void testSetHandicap() {
        Byte expected = (byte) 1;
        player.setHandicap((byte) 1);
        Byte actualHandicap = player.getHandicap();
        assertEquals(expected, actualHandicap);
    }

    @Test
    void testGetHandicap() {
        Byte expected = (byte) 0;
        Byte actualHandicap = player.getHandicap();
        assertEquals(expected, actualHandicap);
    }

    @Test
    void testSetScore() {
        short expected = (short) 1;
        player.setScore((short) 1);
        short actualScore = player.getScore();
        assertEquals(expected, actualScore);
    }

    @Test
    void testGetScore() {
        short expected = (short) 0;
        short actualScore = player.getScore();
        assertEquals(expected, actualScore);
    }

    @Test
    void testSetPoints() {
        short expected = (short) 1;
        player.setPoints((short) 1);
        short actualPoints = player.getPoints();
        assertEquals(expected, actualPoints);
    }

    @Test
    void testGetPoints() {
        short expected = (short) 0;
        short actualPoints = player.getPoints();
        assertEquals(expected, actualPoints);
    }
}