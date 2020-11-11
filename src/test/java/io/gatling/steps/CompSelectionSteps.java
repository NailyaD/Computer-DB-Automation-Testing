package io.gatling.steps;

import io.cucumber.java8.En;
import io.gatling.pages.CompDeletionPage;
import io.gatling.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static io.gatling.util.Constants.baseUrl;

/**
 * CompSelectionSteps
 * Class implements the step definitions for testing the Computer Selection functionality on the Main page.
 */
public class CompSelectionSteps implements En {
    public CompSelectionSteps() {

        MainPage mainPage = new MainPage();
        CompDeletionPage compDeletionPage = new CompDeletionPage();

        Given("I am on the Main page", () -> {
            open(baseUrl);
        });
        When("I click on the ASCI Blue Pacific computer name", mainPage::clickCompNameLink);
    }
}
