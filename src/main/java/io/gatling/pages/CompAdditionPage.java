package io.gatling.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * CompAdditionPage
 * Class implements the methods and fields of the Computer Addition page.
 */

public class CompAdditionPage {

    public CompAdditionPage() {}

    //locators
    private By compName = By.name("name");
    private By introduced = By.name("introduced");
    private By discontinued = By.name("discontinued");
    public static By companyDropDown = By.xpath("//select[@id='company']");
    private By createCompBtn = By.xpath("//body/section[@id='main']/form[1]/div[1]/input[1]");

    public void insertCompData(String compName, String introduced, String discontinued){
        $(this.compName).setValue(compName);
        $(this.introduced).setValue(introduced);
        $(this.discontinued).setValue(discontinued);
    }

    public MainPage clickCompCreateBtn(){
        $(createCompBtn).click();
        return new MainPage();
    }
}
