/*
Test generated by RoostGPT for test restAssuredVertexAi using AI Type Open AI and AI Model gpt-4

1. **Scenario: Check if the function works as expected when a seat is booked**
   - Given a seat that is not booked
   - When the function setSeatBooked is called with the parameter true
   - Then the seat should be marked as booked

2. **Scenario: Check if the function works as expected when a seat is unbooked**
   - Given a seat that is booked
   - When the function setSeatBooked is called with the parameter false
   - Then the seat should be marked as unbooked

3. **Scenario: Check if the function works as expected when a seat is already booked**
   - Given a seat that is already booked
   - When the function setSeatBooked is called with the parameter true
   - Then there should be no changes in the seat booking status

4. **Scenario: Check if the function works as expected when a seat is already unbooked**
   - Given a seat that is already unbooked
   - When the function setSeatBooked is called with the parameter false
   - Then there should be no changes in the seat booking status

5. **Scenario: Check if the function handles null values**
   - Given a seat with an undefined booking status
   - When the function setSeatBooked is called with a null parameter
   - Then the function should throw an error or handle the null value appropriately

6. **Scenario: Check if the function handles non-boolean values**
   - Given a seat with an undefined booking status
   - When the function setSeatBooked is called with a non-boolean parameter
   - Then the function should throw an error or handle the non-boolean value appropriately

Note: The last two scenarios assume that the function setSeatBooked should only accept boolean values. If the function is designed to accept other types of values, these scenarios should be adjusted accordingly.
*/
package com.team.backend;

import org.bson.types.ObjectId;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Screen_setSeatBooked_446a113875_Test {

    private Screen screen;

    @Before
    public void setUp() {
        screen = new Screen();
    }

    @Test
    public void testSetSeatBookedWhenSeatIsNotBooked() {
        screen.setSeatBooked(true);
        Assert.assertTrue(screen.isSeatBooked());
    }

    @Test
    public void testSetSeatBookedWhenSeatIsBooked() {
        screen.setSeatBooked(true);
        screen.setSeatBooked(false);
        Assert.assertFalse(screen.isSeatBooked());
    }

    @Test
    public void testSetSeatBookedWhenSeatIsAlreadyBooked() {
        screen.setSeatBooked(true);
        screen.setSeatBooked(true);
        Assert.assertTrue(screen.isSeatBooked());
    }

    @Test
    public void testSetSeatBookedWhenSeatIsAlreadyUnbooked() {
        screen.setSeatBooked(false);
        screen.setSeatBooked(false);
        Assert.assertFalse(screen.isSeatBooked());
    }
}
