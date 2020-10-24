package io.gatling.steps;

import com.github.javafaker.Faker;
import io.cucumber.java8.En;
import io.gatling.pages.CompAdditionPage;
import io.gatling.util.DateConverter;
import io.gatling.util.Randomizer;

import java.util.Date;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.gatling.pages.CompAdditionPage.companyDropDown;
import static io.gatling.util.Constants.*;

/**
 * CompAdditionSteps
 * Class implements the step definitions for testing the Computer Addition page.
 */

public class CompAdditionSteps implements En {

    public CompAdditionSteps() {

        Faker faker = new Faker();
        DateConverter dateConverter = new DateConverter();
        Randomizer randomizer = new Randomizer();
        CompAdditionPage compAdditionPage = new CompAdditionPage();

        Given("I am on the Computer Addition page", () -> {
            open(compAdditionUrl);
        });

        When("I add new computer with the valid data", () -> {
            String compName = faker.name().name();
            Date introduced = faker.date()
            .between(dateConverter.stringToDateConverter(startDate), dateConverter.stringToDateConverter(endDate));
            Date discontinued = faker.date()
            .between(dateConverter.stringToDateConverter(startDate), dateConverter.stringToDateConverter(endDate));
            compAdditionPage.insertCompData
            (compName, dateConverter.dateToStringConverter(introduced), dateConverter.dateToStringConverter(discontinued));
            $(companyDropDown).selectOptionByValue(String.valueOf(randomizer.getRandomValue(1, 42)));
        });

        When("I click Create this computer button", compAdditionPage::clickCompCreateBtn);
    }
}
