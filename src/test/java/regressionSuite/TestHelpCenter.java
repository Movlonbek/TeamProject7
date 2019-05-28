package regressionSuite;

import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HelpCenter;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;


public class TestHelpCenter extends CommonAPI {
    public HelpCenter helpCenter;

    @BeforeMethod
    public void init() {
        helpCenter = PageFactory.initElements(CommonAPI.driver, HelpCenter.class);
    }
    //test 1.

    public void findHelpCenter() {
        helpCenter.clickDropDownMenu();
        sleepFor(1);
        helpCenter.clickHelp();
        sleepFor(1);
        String pageSource = driver.getPageSource();
        if (pageSource.indexOf("Hello. What can we help you with?") != -1)  {
            System.out.println("success. help center working");
        } else {
            System.out.println("failure. help center not working");

        }
    }
    //test.2

    public void trackYourOrder() {
        helpCenter.clickDropDownMenu();
        sleepFor(1);
        helpCenter.clickHelp();
        sleepFor(1);
        clickByXpath("/html/body/div[2]/div[3]/div/div[1]/div[1]/div[1]/div/div[2]/a");
        sleepFor(1);
        String pageSource = driver.getPageSource();
        if (pageSource.indexOf("Sign in") != -1)  {
            System.out.println("success. help orders working");
        } else {
            System.out.println("failure. help orders not working");

        }
    }
    //test. 3.

    public void ManageOrder() {
        helpCenter.clickDropDownMenu();
        sleepFor(1);
        helpCenter.clickHelp();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"category-section\"]/li[3]/a"));
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"help-gateway-category-2\"]/div/div/div/ul/li[2]/a"));
        sleepFor(1);
    }
    //test.4

    public void contactNumber() {
        helpCenter.clickDropDownMenu();
        sleepFor(1);
        helpCenter.clickHelp();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"helpsearch\"]")).sendKeys("contact number", Keys.ENTER);
        sleepFor(1);

    }
    //test.5
    @Test
    public void accountSettings() {
        helpCenter.clickDropDownMenu();
        sleepFor(1);
        helpCenter.clickHelp();
        sleepFor(1);
        clickByXpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div[3]/div/div[2]/a");
        sleepFor(1);
    }




}
