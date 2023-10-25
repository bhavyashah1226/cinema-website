// Test generated by RoostGPT for test roost-test using AI Type Azure Open AI and AI Model roost-gpt4-32k

package com.team.backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;


@SpringBootTest
public class Screen_setSeatBooked_446a113875_Test {

    private Screen screen;

    @BeforeEach
    public void setup() {
        screen = new Screen();
    }

    @Test
    public void testSetSeatBookedTrue() {
        boolean expectedValue = true;
        screen.setSeatBooked(expectedValue);
        boolean actualValue = (boolean) ReflectionTestUtils.getField(screen, "seatBooked");
        Assertions.assertEquals(expectedValue, actualValue, "Failed to set seat booked as expected!");
    }

    @Test
    public void testSetSeatBookedFalse() {
        boolean expectedValue = false;
        screen.setSeatBooked(expectedValue);
        boolean actualValue = (boolean) ReflectionTestUtils.getField(screen, "seatBooked");
        Assertions.assertEquals(expectedValue, actualValue, "Failed to set seat not booked as expected!");
    }
}
