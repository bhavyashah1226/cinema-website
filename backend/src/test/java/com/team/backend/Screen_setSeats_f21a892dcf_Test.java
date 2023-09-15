package com.team.backend;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Screen_setSeats_f21a892dcf_Test {

    private Screen screen;
    private ArrayList<String> seats;

    @BeforeEach
    public void setup() {
        screen = new Screen();
        seats = new ArrayList<>(Arrays.asList("A1", "A2", "A3"));
    }

    @Test
    public void testSetSeats_Success() {
        screen.setSeats(seats);
        assertEquals(seats, screen.getSeats(), "The seats should be set correctly");
    }

    @Test
    public void testSetSeats_Null() {
        screen.setSeats(null);
        assertEquals(new ArrayList<>(), screen.getSeats(), "The seats should be an empty list when set to null");
    }

    @Test
    public void testSetSeats_Empty() {
        screen.setSeats(new ArrayList<>());
        assertEquals(new ArrayList<>(), screen.getSeats(), "The seats should be an empty list when set to an empty list");
    }
}
