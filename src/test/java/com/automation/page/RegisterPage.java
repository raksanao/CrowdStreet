package com.automation.page;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RegisterPage extends BasePage {
    @FindBy(xpath = "(//*[contains(text(),'Create An Account')])[1] ")
    protected WebElement createAccount;
    @FindBy(id = "create_account_email")
    protected WebElement email;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    protected WebElement firstName;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    protected WebElement lastName;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    protected WebElement phone;

    @FindBy(xpath = " (//input[@type='password'])[2]")
    protected WebElement passsword;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    protected WebElement address;


    @FindBy(xpath = "(//input[@type='text'])[7]")
    protected WebElement city;

    @FindBy(xpath = "(//i[@class='dropdown icon'])[1] ")
    protected WebElement state;


    @FindBy(xpath = "//span[contains(text(),'Zip or Postal Code')]")
    protected WebElement zipCode;


    public void clickToCreateAccount() {
        createAccount.click();
    }

    public void setEmail(String str) {
        email.sendKeys(str);

    }

    public void setFirstName(String str1) {
        firstName.sendKeys(str1);

    }

    public void setLastName(String str2) {
        lastName.sendKeys(str2);


    }

    public void setPassword(String str3) {
        passsword.sendKeys(str3);
    }

    public void setPhone(String str3) {
        phone.sendKeys(str3);


    }

    public void setAddress(String str4) {
        address.sendKeys(str4);

    }

    public void setCity(String str5) {
        city.sendKeys(str5);
    }

    public void setState() {


//
        WebElement link = Driver.getDriver().findElement(By.xpath("(//div[@role='combobox'])[1]"));
        link.click();
//
        // List<WebElement> link2 = Driver.getDriver().findElements(By.xpath("(//div[@class='item'])[1]"));
        List<WebElement> link2 = Driver.getDriver().findElements(By.xpath("(//div[@role='listbox'])[1]/div"));

        BrowserUtils.wait(4);
        for (WebElement each : link2) {

            if (each.getText().contains("Texas (TX)")) {
                each.submit();
                if (!each.isSelected()) {
                    each.click();
                    System.out.println(each.isSelected());
                    Assert.assertEquals(each.getText(), "Texas (TX)");
                }

                //  WebElement link = Driver.getDriver().findElement(By.xpath("(//div[@role='combobox'])[1]"));
                //link.click();
//        while(!driver.getPageSource().contains("Texas(TX)")){
//            Actions action = new Actions(Driver.getDriver());
//            action.sendKeys(Keys.chord(Keys.DOWN)).build().perform();
//             break;
//        //this all the states list
                // List<WebElement> states = driver.findElements(By.xpath("(//div[@role='listbox'])[1]/div"));

//            while (!driver.getPageSource().contains("Texas(TX)")) {
//                Actions action = new Actions(Driver.getDriver());
//                action.sendKeys(Keys.chord(Keys.DOWN)).build().perform();
//                break;


            }
        }

    }
}
