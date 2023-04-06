package com.tv.jawwy.subscribe.pages;

import com.tv.jawwy.subscribe.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PackagesPage extends BasePage {

    public PackagesPage (WebDriver driver){
        super(driver);
    }


   @FindBy(id = "name-لايت")
   protected WebElement package1;
   @FindBy(className = "country-current")
    protected WebElement changeCountryButton;
    @FindBy(id = "ae-contry-lable")
    protected WebElement selectUaeCountry;

    @FindBy(id = "currency-لايت")
    protected WebElement package1CurrencyAndPrice;


public PackagesPage ChangeCountry(){
    changeCountryButton.click();
    selectUaeCountry.click();
return this;

}
public String checkPck1(){
    return package1.getText();
}
public PackagesPage load(){
    driver.get("https://subscribe.jawwy.tv/");
    return this;

}
    public String checkPriceAndCurrencyPck1(){
        return package1CurrencyAndPrice.getText();
    }

}
