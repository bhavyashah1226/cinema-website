// Test generated by RoostGPT for test go-test using AI Type Open AI and AI Model gpt-3.5-turbo

package com.team.backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = {Screen_getScreenName_f8aab6599c_Test.class})
public class Screen_getScreenName_f8aab6599c_Test {

    @Test
    public void testGetScreenName() {
        Screen screen = new Screen();
        screen.setScreenName("TestScreen");

        Assertions.assertEquals("TestScreen", screen.getScreenName());
    }

    @Test
    public void testGetScreenName_Null() {
        Screen screen = new Screen();
        screen.setScreenName(null);

        Assertions.assertNull(screen.getScreenName());
    }
}

class Screen {
    private String screenName;

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
}
