package io.gatling.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CompDeletionPage {

    public CompDeletionPage() {}

    private By deleteCompBtn = By.xpath("//body/section[@id='main']/form[2]/input[1]");

    public MainPage clickCompDeleteBtn(){
        $(deleteCompBtn).click();
        return new MainPage();
    }
}
