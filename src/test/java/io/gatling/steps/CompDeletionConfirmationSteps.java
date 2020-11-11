package io.gatling.steps;

import io.cucumber.docstring.DocString;
import io.cucumber.java8.En;
import io.gatling.pages.MainPage;

public class CompDeletionConfirmationSteps implements En {

    public CompDeletionConfirmationSteps() {

        MainPage mainPage = new MainPage();

        Then("I see a confirmation message:", (DocString message) -> {
            String msg = message.getContent();
            mainPage.assertMessage(msg);
        });
    }
}
