// Test generated by RoostGPT for test cinemaWebsite using AI Type Open AI and AI Model gpt-4

package com.team.backend;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Screen_getSeats_d4e6eecacd_Test {

    private Screen screen;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        screen = new Screen();
    }

    @Test
    public void testGetSeatsWhenSeatsArePresent() {
        ArrayList<String> seats = new ArrayList<>();
        seats.add("A1");
        seats.add("A2");
        screen.setSeats(seats);
        assertEquals(seats, screen.getSeats());
    }

    @Test
    public void testGetSeatsWhenNoSeatsArePresent() {
        ArrayList<String> seats = new ArrayList<>();
        screen.setSeats(seats);
        assertEquals(seats, screen.getSeats());
    }
}
