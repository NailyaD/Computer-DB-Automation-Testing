package io.gatling.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

/**
 * MainPage
 * Class implements the methods and fields of the Main page.
 */

public class MainPage {

    public MainPage() {}

    public static final By message = By.xpath("/html[1]/body[1]/section[1]/div[1]");
    public static final By compNameLink = By.linkText("ASCI Blue Pacific");

    public void assertMessage(String msg){
        $(message).shouldHave(text(msg));
    }

    public void isVisible(){
        $(message).isDisplayed();
    }

    public CompDeletionPage clickCompNameLink(){
        $(compNameLink).click();
        return new CompDeletionPage();
    }
}
