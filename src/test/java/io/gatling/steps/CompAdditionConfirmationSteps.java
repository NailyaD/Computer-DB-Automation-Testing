package io.gatling.steps;

import io.cucumber.java8.En;
import io.gatling.pages.MainPage;

/**
 * CompAdditionConfirmationSteps
 * Class implements the step definitions for testing the computer addition success at the Main page.
 */

public class CompAdditionConfirmationSteps implements En {

    public CompAdditionConfirmationSteps() {

        MainPage mainPage = new MainPage();

        Then("I see a confirmation message", mainPage::isVisible);
    }
}
