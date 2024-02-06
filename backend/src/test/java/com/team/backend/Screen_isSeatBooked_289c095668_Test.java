// ********RoostGPT********
/*
Test generated by RoostGPT for test restAssuredJan24 using AI Type Open AI and AI Model gpt-4

1. Scenario: Seat is not booked.
   Test Case: Invoke the `isSeatBooked` function when the `seatBooked` variable is set to `false`. 
   Expected Result: The function should return `false` indicating that the seat is not booked.

2. Scenario: Seat is booked.
   Test Case: Invoke the `isSeatBooked` function when the `seatBooked` variable is set to `true`.
   Expected Result: The function should return `true` indicating that the seat is booked.

3. Scenario: Check the default value of `seatBooked`.
   Test Case: Invoke the `isSeatBooked` function without explicitly setting the `seatBooked` variable.
   Expected Result: The function should return the default value of the boolean variable, which is `false`.

4. Scenario: Change the `seatBooked` status after checking.
   Test Case: Invoke the `isSeatBooked` function, change the status of `seatBooked` after the first invocation, and then invoke the function again.
   Expected Result: The function should return the latest status of `seatBooked`.

5. Scenario: Concurrent access to the `isSeatBooked` function.
   Test Case: Invoke the `isSeatBooked` function from multiple threads concurrently.
   Expected Result: The function should return the correct `seatBooked` status for each thread. The test case is designed to check whether the function is thread-safe.

Note: Since the `isSeatBooked` function is a simple getter function, it does not involve any complex business logic or error handling. Therefore, the test scenarios mainly focus on the correctness of the returned value.
*/

// ********RoostGPT********
package com.team.backend;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Screen_isSeatBooked_289c095668_Test {

    @Test
    public void testIsSeatBookedWhenSeatIsNotBooked() {
        Screen screen = new Screen();
        screen.setSeatBooked(false);

        boolean result = screen.isSeatBooked();
        Assertions.assertEquals(false, result, "Expected seat booked status to be false.");
    }

    @Test
    public void testIsSeatBookedWhenSeatIsBooked() {
        Screen screen = new Screen();
        screen.setSeatBooked(true);

        boolean result = screen.isSeatBooked();
        Assertions.assertEquals(true, result, "Expected seat booked status to be true.");
    }

    @Test
    public void testIsSeatBookedDefault() {
        Screen screen = new Screen();

        boolean result = screen.isSeatBooked();
        Assertions.assertEquals(false, result, "Expected default seat booked status to be false.");
    }

    @Test
    public void testIsSeatBookedAfterChangingStatus() {
        Screen screen = new Screen();
        screen.setSeatBooked(false);
        screen.isSeatBooked();
        screen.setSeatBooked(true);

        boolean result = screen.isSeatBooked();
        Assertions.assertEquals(true, result, "Expected seat booked status to be updated to true.");
    }

    @Test
    public void testIsSeatBookedConcurrentAccess() throws InterruptedException {
        Screen screen = new Screen();
        screen.setSeatBooked(false);

        Thread thread1 = new Thread(() -> {
            Assertions.assertEquals(false, screen.isSeatBooked(), "Expected seat booked status to be false in thread 1.");
        });

        Thread thread2 = new Thread(() -> {
            Assertions.assertEquals(false, screen.isSeatBooked(), "Expected seat booked status to be false in thread 2.");
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
