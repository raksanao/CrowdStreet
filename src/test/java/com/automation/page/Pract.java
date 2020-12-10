package com.automation.page;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Pract {
    @Test
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
//      driver = new ChromeDriver(chromeOptions);
        Driver.getDriver().get("https://test.crowdstreet.com/invexp/accounts/create-account/");
        Driver.getDriver().manage().window().maximize();

        //  WebElement link = Driver.getDriver().findElement(By.xpath("(//div[@role='combobox'])[1]"));
        //  link.click();
//        WebElement send = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Alaska (AK)')]"));
//        send.sendKeys("Alaska");
//        BrowserUtils.wait(5);
        List<WebElement> link2 = Driver.getDriver().findElements(By.xpath("(//div[@role='listbox'])[1]/div"));
        BrowserUtils.wait(4);
        for (WebElement each : link2) {

            if (each.getText().contains("Texas (TX)")) {
                each.submit();
                if (!each.isSelected()) {
                    each.click();
                    System.out.println(each.isSelected());
                    Assert.assertEquals(each.getText(), "Texas (TX)");


                    while (!Driver.getDriver().getPageSource().contains("Texas(TX)")) {
                        Actions action = new Actions(Driver.getDriver());
                        action.sendKeys(Keys.chord(Keys.DOWN)).build().perform();
                        break;


//        for (WebElement each : link2) {
//
//            if (each.getText().contains("Texas (TX)")) {
//                each.submit();
//                if (!each.isSelected()) {
//                    each.click();
//                    System.out.println(each.isSelected());
//                    Assert.assertEquals(each.getText(), "Texas (TX)");

                    }
                }

            }
        }
    }
}