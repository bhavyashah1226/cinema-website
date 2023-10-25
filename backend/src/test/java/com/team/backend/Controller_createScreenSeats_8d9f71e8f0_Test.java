// Test generated by RoostGPT for test roost-test using AI Type Azure Open AI and AI Model roost-gpt4-32k

package com.team.backend;

import com.team.backend.model.Screen;
import com.team.backend.repository.ScreenRepository;
import org.bson.types.ObjectId;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.Valid;

import static org.mockito.Mockito.when;

@SpringBootTest
public class Controller_createScreenSeats_8d9f71e8f0_Test {

    @InjectMocks
    Controller controller;

    @Mock
    ScreenRepository repository;

    @Test
    public void testCreateScreenSeats_Success() {
        Screen screen = new Screen();
        when(repository.save(Mockito.any(Screen.class))).thenReturn(screen);

        Screen result = controller.createScreenSeats(screen);

        Assert.assertNotNull("Assert that the result is not null", result);
        Assert.assertNotNull("Assert that the id of the result is not null", result.get_id());
    }

    @Test
    public void testCreateScreenSeats_NullRequestBody() {
        Screen result = controller.createScreenSeats(null);
        Mockito.verify(repository, Mockito.never()).save(Mockito.any(Screen.class));
        Assert.assertNull("Assert that the result is null", result);
    }
}
