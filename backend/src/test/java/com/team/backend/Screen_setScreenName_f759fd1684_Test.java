// Test generated by RoostGPT for test go-test using AI Type Open AI and AI Model gpt-3.5-turbo

package com.team.backend;

import org.junit.Assert;
import org.junit.Test;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Screen_setScreenName_f759fd1684_Test {

    private Screen screen;

    @Given("a screen object")
    public void givenAScreenObject() {
        screen = new Screen();
    }

    @When("I set the screen name to \"(.*)\"")
    public void whenISetTheScreenName(String screenName) {
        screen.setScreenName(screenName);
    }

    @Then("the screen name should be \"(.*)\"")
    public void thenTheScreenNameShouldBe(String expectedScreenName) {
        Assert.assertEquals(expectedScreenName, screen.getScreenName());
    }
}
