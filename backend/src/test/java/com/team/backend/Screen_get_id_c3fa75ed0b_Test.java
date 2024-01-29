// ********RoostGPT********
/*
Test generated by RoostGPT for test restAssuredJan24 using AI Type Open AI and AI Model gpt-4

1. **Scenario:** Validate that the function `get_id()` returns a hexadecimal string.
   **Test:** Call the `get_id()` function and check if the returned value is a hexadecimal string.

2. **Scenario:** Validate that the function `get_id()` returns the correct ID.
   **Test:** Create an ObjectId, convert it to a hexadecimal string, and compare it with the return value of `get_id()`.

3. **Scenario:** Validate that the function `get_id()` returns a unique ID for each object.
   **Test:** Create multiple objects and call `get_id()` for each. Check if all returned IDs are unique.

4. **Scenario:** Validate that the function `get_id()` returns the same ID for the same object on multiple calls.
   **Test:** Call `get_id()` multiple times on the same object and check if the returned ID is the same.

5. **Scenario:** Validate that the function `get_id()` returns a non-null value.
   **Test:** Call `get_id()` and check if the returned value is not null.

6. **Scenario:** Validate that the function `get_id()` returns a non-empty value.
   **Test:** Call `get_id()` and check if the returned value is not an empty string.

7. **Scenario:** Validate that the function `get_id()` returns a 24-character long string.
   **Test:** Call `get_id()` and check if the length of the returned string is 24 (as a hexadecimal representation of an ObjectId is always 24 characters long).

8. **Scenario:** Validate that the function `get_id()` returns a string that can be converted back to an ObjectId.
   **Test:** Call `get_id()`, convert the returned string back to an ObjectId, and check if the conversion is successful.
*/

// ********RoostGPT********
package com.team.backend;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Screen_get_id_c3fa75ed0b_Test {

    Screen screen;

    @BeforeEach
    public void setUp() {
        screen = new Screen();
        screen.set_id(new ObjectId());
    }

    @Test
    public void testGetIdReturnsHexadecimal() {
        String id = screen.get_id();
        assertTrue(id.matches("-?[0-9a-fA-F]+"));
    }

    @Test
    public void testGetIdReturnsCorrectId() {
        ObjectId objectId = new ObjectId();
        screen.set_id(objectId);
        assertEquals(objectId.toHexString(), screen.get_id());
    }

    @Test
    public void testGetIdReturnsUniqueId() {
        Screen anotherScreen = new Screen();
        anotherScreen.set_id(new ObjectId());
        assertNotEquals(screen.get_id(), anotherScreen.get_id());
    }

    @Test
    public void testGetIdReturnsSameIdForSameObject() {
        String id1 = screen.get_id();
        String id2 = screen.get_id();
        assertEquals(id1, id2);
    }

    @Test
    public void testGetIdReturnsNonNullValue() {
        assertNotNull(screen.get_id());
    }

    @Test
    public void testGetIdReturnsNonEmptyValue() {
        assertFalse(screen.get_id().isEmpty());
    }

    @Test
    public void testGetIdReturns24CharacterLongString() {
        assertEquals(24, screen.get_id().length());
    }

    @Test
    public void testGetIdReturnsStringThatCanBeConvertedBackToObjectId() {
        ObjectId objectId = new ObjectId(screen.get_id());
        assertEquals(screen.get_id(), objectId.toHexString());
    }
}
