package io.gatling.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * MainPage
 * Class implements the methods and fields of the Main page.
 */

public class MainPage {

    public MainPage() {}

    public static final By message = By.xpath("//body/section[@id='main']/div[1]");

    public void isVisible(){
        $(message).isDisplayed();
    }
}
