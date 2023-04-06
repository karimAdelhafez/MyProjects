package com.tv.jawwy.subscribe.testcases;

import com.tv.jawwy.subscribe.base.BaseTest;
import com.tv.jawwy.subscribe.pages.PackagesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PackageInfoTest extends BaseTest {
    @Test
    public void CheckPackagesInfo(){

       //Loading the site and Select UAE Country >>>builder pattern
       PackagesPage packagesPage =new PackagesPage(driver);
       packagesPage.load().ChangeCountry();


        //check package1 name
        String pck1 = packagesPage.checkPck1();
        Assert.assertEquals(pck1,"لايت");

        //Check Package1 Currency and Price
        String pk1CurrencyAndPrice = packagesPage.checkPriceAndCurrencyPck1();
        Assert.assertEquals(pk1CurrencyAndPrice , "5.4 دولار أمريكي/شهر");

}


    //Package2
    //String pck2 = driver.findElement(By.id("name-الأساسية")).getText();
    // String pk2CurrencyAndPrice =  driver.findElement(By.id("currency-الأساسية")).getText();
    //System.out.println(pck2);

    //System.out.println("The Budget is : " + pk2CurrencyAndPrice);



}
