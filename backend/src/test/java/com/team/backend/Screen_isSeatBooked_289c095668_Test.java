// Test generated by RoostGPT for test go-test using AI Type Open AI and AI Model gpt-3.5-turbo

package com.team.backend;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Screen_isSeatBooked_289c095668_Test {

    @InjectMocks
    private Screen screen;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testIsSeatBooked_WhenSeatIsBooked_ReturnsTrue() {
        // Arrange
        screen.setSeatBooked(true);

        // Act
        boolean isSeatBooked = screen.isSeatBooked();

        // Assert
        Assert.assertTrue(isSeatBooked);
    }

    @Test
    public void testIsSeatBooked_WhenSeatIsNotBooked_ReturnsFalse() {
        // Arrange
        screen.setSeatBooked(false);

        // Act
        boolean isSeatBooked = screen.isSeatBooked();

        // Assert
        Assert.assertFalse(isSeatBooked);
    }
}
