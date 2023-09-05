// Test generated by RoostGPT for test go-test using AI Type Open AI and AI Model gpt-3.5-turbo

package com.team.backend;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class Screen_setSeats_f21a892dcf_Test {
    
    @Mock
    private ArrayList<String> mockSeats;
    
    private Screen screen;
    
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        screen = new Screen();
    }
    
    @Test
    public void testSetSeats_Success() {
        // Arrange
        ArrayList<String> seats = new ArrayList<>();
        seats.add("A1");
        seats.add("A2");
        
        // Act
        screen.setSeats(seats);
        
        // Assert
        Assert.assertEquals(seats, screen.getSeats());
    }
    
    @Test
    public void testSetSeats_EmptyList() {
        // Arrange
        ArrayList<String> seats = new ArrayList<>();
        
        // Act
        screen.setSeats(seats);
        
        // Assert
        Assert.assertEquals(seats, screen.getSeats());
    }
}
