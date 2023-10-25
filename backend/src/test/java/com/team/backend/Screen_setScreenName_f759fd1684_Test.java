// Test generated by RoostGPT for test roostPostmanTest using AI Type Azure Open AI and AI Model roost-gpt4-32k

package com.team.backend;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class Screen_setScreenName_f759fd1684_Test {

    @InjectMocks
    private Screen screen;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetScreenName_success() {
        String expectedScreenName = "Screen-1";
        screen.setScreenName(expectedScreenName);
        Assert.assertEquals(expectedScreenName, screen.getScreenName());
    }

    @Test
    public void testSetScreenName_null() {
        String expectedScreenName = null;
        screen.setScreenName(expectedScreenName);
        Assert.assertEquals(expectedScreenName, screen.getScreenName());
    }
}
