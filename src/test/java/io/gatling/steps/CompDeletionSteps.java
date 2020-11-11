package io.gatling.steps;

import io.cucumber.java8.En;
import io.gatling.pages.CompDeletionPage;

public class CompDeletionSteps implements En {

    public CompDeletionSteps() {

        CompDeletionPage compDeletionPage = new CompDeletionPage();

        When("I click Delete this computer button", compDeletionPage::clickCompDeleteBtn);
    }
}
