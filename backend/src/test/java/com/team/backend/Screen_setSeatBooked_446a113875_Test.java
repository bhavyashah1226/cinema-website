// ********RoostGPT********
/*
Test generated by RoostGPT for test restAssuredJan24 using AI Type Open AI and AI Model gpt-4

1. Scenario: Check if the function properly updates the status of `seatBooked` when a true value is passed. 
   Test Steps: Pass the value true to the function `setSeatBooked`.
   Expected Result: The function should update the `seatBooked` status to true.

2. Scenario: Check if the function properly updates the status of `seatBooked` when a false value is passed.
   Test Steps: Pass the value false to the function `setSeatBooked`.
   Expected Result: The function should update the `seatBooked` status to false.

3. Scenario: Check if the function properly handles null values.
   Test Steps: Pass a null value to the function `setSeatBooked`.
   Expected Result: Depending on the business logic, this scenario may result in an error or the function may ignore the null value and leave the `seatBooked` status unchanged.

4. Scenario: Check if the function updates the status of `seatBooked` when it is called multiple times.
   Test Steps: Call the `setSeatBooked` function multiple times with different values.
   Expected Result: The function should always update the `seatBooked` status to the value passed in the most recent call.

5. Scenario: Check if the function is thread-safe.
   Test Steps: Call the `setSeatBooked` function from multiple threads at the same time.
   Expected Result: The function should correctly update the `seatBooked` status, regardless of the number of threads from which it is called.

6. Scenario: Check if the function works correctly when the `seatBooked` status is already set.
   Test Steps: Call the `setSeatBooked` function after the `seatBooked` status has already been set.
   Expected Result: The function should correctly update the `seatBooked` status to the new value.

7. Scenario: Check if the function works correctly when the `seatBooked` status is not yet set.
   Test Steps: Call the `setSeatBooked` function when the `seatBooked` status has not yet been set.
   Expected Result: The function should correctly set the `seatBooked` status to the passed value.
*/

// ********RoostGPT********
package com.team.backend;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
    void testSetSeatBookedMultipleTimes() {
        screen.setSeatBooked(true);
        assertTrue(screen.isSeatBooked());

        screen.setSeatBooked(false);
        assertFalse(screen.isSeatBooked());
    }

    @Test
    void testSetSeatBookedAlreadySet() {
        screen.setSeatBooked(true);
        screen.setSeatBooked(false);
        assertFalse(screen.isSeatBooked());
    }

    @Test
    void testSetSeatBookedNotYetSet() {
        screen.setSeatBooked(true);
        assertTrue(screen.isSeatBooked());
    }
}