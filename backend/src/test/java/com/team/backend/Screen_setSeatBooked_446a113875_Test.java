// ********RoostGPT********
/*
Test generated by RoostGPT for test restAssuredJan24 using AI Type Open AI and AI Model gpt-4

Test Scenario 1: 
SetSeatBooked Functionality
Test the setSeatBooked function with a boolean input of true to check if the seat is booked.

Test Scenario 2: 
SetSeatBooked Functionality
Test the setSeatBooked function with a boolean input of false to check if the seat is not booked.

Test Scenario 3: 
Null Input Test
Test the setSeatBooked function with a null input to check how the function handles null values.

Test Scenario 4: 
SetSeatBooked Functionality
Test the setSeatBooked function with a boolean input of true and then again with false to check if the function updates the seat status correctly.

Test Scenario 5: 
SetSeatBooked Functionality
Test the setSeatBooked function with a boolean input of false and then again with true to check if the function updates the seat status correctly.

Test Scenario 6: 
Multiple SetSeatBooked Function Calls
Test the setSeatBooked function with multiple calls to check if the function handles consecutive seat bookings correctly.

Test Scenario 7: 
SetSeatBooked Functionality with Other Data Types
Test the setSeatBooked function with inputs of other data types (like String, integer etc.) to check how the function handles incompatible data types. 

Test Scenario 8: 
Concurrency Test
Test the setSeatBooked function with multiple threads to check if it handles concurrency correctly.
*/

// ********RoostGPT********
package com.team.backend;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.bson.types.ObjectId;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Screen_setSeatBooked_446a113875_Test {

    private Screen screen;

    @BeforeEach
    void setUp() {
        screen = new Screen();
    }

    @Test
    void testSetSeatBookedTrue() {
        screen.setSeatBooked(true);
        assertTrue(screen.isSeatBooked());
    }

    @Test
    void testSetSeatBookedFalse() {
        screen.setSeatBooked(false);
        assertFalse(screen.isSeatBooked());
    }

    @Test
    void testSetSeatBookedNull() {
        assertThrows(NullPointerException.class, () -> screen.setSeatBooked(null));
    }

    @Test
    void testSetSeatBookedUpdate() {
        screen.setSeatBooked(true);
        assertTrue(screen.isSeatBooked());
        screen.setSeatBooked(false);
        assertFalse(screen.isSeatBooked());
    }

    @Test
    void testSetSeatBookedMultipleCalls() {
        screen.setSeatBooked(true);
        screen.setSeatBooked(false);
        screen.setSeatBooked(true);
        assertTrue(screen.isSeatBooked());
    }

    @Test
    void testSetSeatBookedWithOtherDataTypes() {
        assertThrows(ClassCastException.class, () -> screen.setSeatBooked("true"));
        assertThrows(ClassCastException.class, () -> screen.setSeatBooked(1));
    }

    @Test
    void testSetSeatBookedConcurrency() {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            service.submit(() -> screen.setSeatBooked(true));
        }
        assertTrue(screen.isSeatBooked());
    }
}
