// Test generated by RoostGPT for test roostUnitTest using AI Type Azure Open AI and AI Model roost-gpt4-32k

package com.team.backend;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.Arrays;

@ExtendWith(MockitoExtension.class)
public class Controller_getAllScreens_b85a4c05e8_Test {

    @InjectMocks
    Controller controller;

    @Mock
    Repository repository;

    @Test
    public void testGetAllScreens_success() {
        Screen screen1 = new Screen();
        screen1.set_id(ObjectId.get());
        Screen screen2 = new Screen();
        screen2.set_id(ObjectId.get());

        when(repository.findAll()).thenReturn(Arrays.asList(screen1, screen2));
        List<Screen> screens = controller.getAllScreens();

        assertNotNull(screens);
        assertEquals(2, screens.size());
    }

    @Test
    public void testGetAllScreens_empty() {
        when(repository.findAll()).thenReturn(Arrays.asList());
        List<Screen> screens = controller.getAllScreens();

        assertNotNull(screens);
        assertTrue(screens.isEmpty());
    }
}
