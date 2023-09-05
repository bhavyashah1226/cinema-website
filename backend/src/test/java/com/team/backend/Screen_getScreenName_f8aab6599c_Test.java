// Test generated by RoostGPT for test go-test using AI Type Open AI and AI Model gpt-3.5-turbo

package com.team.backend;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import java.util.ArrayList;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class Screen_getScreenName_f8aab6599c_Test {

    private Screen screen;
    private String screenName;

    @Given("^a screen with a screen name$")
    public void aScreenWithAScreenName() {
        screen = new Screen();
        screenName = "Test Screen";
        screen.setScreenName(screenName);
    }

    @When("^I call the getScreenName method$")
    public void iCallTheGetScreenNameMethod() {
        screen.getScreenName();
    }

    @Then("^I should get the screen name$")
    public void iShouldGetTheScreenName() {
        assertEquals(screenName, screen.getScreenName());
    }
}
