package com.automation.page;

import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver=Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,30);
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[contains(text(),'Create An Account')])[1] ")
    private WebElement createAccount;


    public void navigateTo(String component){
        String locator="//a[text() = '"+ component +"']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();

    }


}
