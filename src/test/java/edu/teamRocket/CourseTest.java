package edu.teamRocket;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {
    static Course course;
    static Player playerA = new Player("mk", (byte) 0);
    static final Byte[] coursePlayerA = {6, 5, 4, 7, 9, 1, 5, 6, 8, 1, 8, 1, 6, 5, 8, 7, 4, 3};
    static Player playerB = new Player("mj", (byte) 0);
    static final Byte[] coursePlayerB = {8, 1, 6, 5, 8, 7, 4, 3, 6, 5, 4, 7, 9, 1, 5, 6, 8, 1};

    @BeforeAll
    static void setUpCourse() {
        course = new Course();
        course.addPlayerCourse(playerA, coursePlayerA);
        course.addPlayerCourse(playerB, coursePlayerB);
    }

    @Test
    void testGetPlayerCourse() {
        byte[] expectedPlayerA = {6, 5, 4, 7, 9, 1, 5, 6, 8, 1, 8, 1, 6, 5, 8, 7, 4, 3};
        byte[] expectedPlayerB = {8, 1, 6, 5, 8, 7, 4, 3, 6, 5, 4, 7, 9, 1, 5, 6, 8, 1};
        byte[] actualPlayerA = course.getPlayerCourse(playerA);
        byte[] actualPlayerB = course.getPlayerCourse(playerB);
        assertEquals(Arrays.toString(expectedPlayerA), Arrays.toString(actualPlayerA));
        assertEquals(Arrays.toString(expectedPlayerB), Arrays.toString(actualPlayerB));
    }




}
