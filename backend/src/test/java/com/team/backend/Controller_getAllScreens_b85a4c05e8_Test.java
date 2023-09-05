// Test generated by RoostGPT for test go-test using AI Type Open AI and AI Model gpt-3.5-turbo

package com.team.backend;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class Controller_getAllScreens_b85a4c05e8_Test {

    @InjectMocks
    private Controller controller;

    @Mock
    private ScreenRepository repository;

    private List<Screen> screens;

    @Given("a list of screens exists")
    public void aListOfScreensExists() {
        screens = new ArrayList<>();
        screens.add(new Screen("Screen1"));
        screens.add(new Screen("Screen2"));
        screens.add(new Screen("Screen3"));
    }

    @When("the getAllScreens method is called")
    public void theGetAllScreensMethodIsCalled() {
        MockitoAnnotations.initMocks(this);
        when(repository.findAll()).thenReturn(screens);
    }

    @Then("the method should return the list of screens")
    public void theMethodShouldReturnTheListOfScreens() {
        List<Screen> result = controller.getAllScreens();
        Assert.assertEquals(screens, result);
    }

    @Given("the screen repository is empty")
    public void theScreenRepositoryIsEmpty() {
        screens = new ArrayList<>();
    }

    @Then("the method should return an empty list")
    public void theMethodShouldReturnAnEmptyList() {
        List<Screen> result = controller.getAllScreens();
        Assert.assertTrue(result.isEmpty());
    }

    @Given("the screen repository throws an exception")
    public void theScreenRepositoryThrowsAnException() {
        screens = null;
        when(repository.findAll()).thenThrow(new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    @Then("the method should throw an exception")
    public void theMethodShouldThrowAnException() {
        try {
            controller.getAllScreens();
            Assert.fail("Expected exception not thrown");
        } catch (HttpClientErrorException e) {
            Assert.assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, e.getStatusCode());
        }
    }
}
