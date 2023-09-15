package com.team.backend;

import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class Screen_get_id_c3fa75ed0b_Test {

    @Mock
    private ObjectId _id;

    private Screen screen;

    @Before
    public void setUp() {
        screen = new Screen();
        screen.set_id(_id);
    }

    @Test
    public void testGetId_Success() {
        String expectedId = "507f1f77bcf86cd799439011";
        when(_id.toHexString()).thenReturn(expectedId);

        String actualId = screen.get_id();
        assertEquals(expectedId, actualId);
    }

    @Test
    public void testGetId_Failure() {
        String unexpectedId = "507f1f77bcf86cd799439012";
        String expectedId = "507f1f77bcf86cd799439011";
        when(_id.toHexString()).thenReturn(expectedId);

        String actualId = screen.get_id();
        assertNotEquals(unexpectedId, actualId);
    }
}
