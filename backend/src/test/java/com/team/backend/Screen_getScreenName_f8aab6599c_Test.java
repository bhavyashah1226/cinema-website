// Test generated by RoostGPT for test roostPostmanTest using AI Type Azure Open AI and AI Model roost-gpt4-32k

package com.team.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Screen_getScreenName_f8aab6599c_Test {

    private Screen screen;

    @BeforeEach
    public void setup() {
        screen = new Screen();
    }

    @Test
    public void testGetScreenName_NotNull() {
        screen.setScreenName("Main Screen");
        String screenName = screen.getScreenName();
        assertNotNull(screenName, "Screen name should not be null");
    }

    @Test
    public void testGetScreenName_CorrectValue() {
        String expectedScreenName = "Main Screen";
        screen.setScreenName(expectedScreenName);
        String actualScreenName = screen.getScreenName();
        assertEquals(expectedScreenName, actualScreenName, "Screen name should match the expected value");
    }
}
