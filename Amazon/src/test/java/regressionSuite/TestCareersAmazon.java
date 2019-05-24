package regressionSuite;


import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.CareersPage;
import regression.Homepage;

public class TestCareersAmazon extends CareersPage {
    public CareersPage careersPage;

    @BeforeMethod
    public void init() {
        careersPage = PageFactory.initElements(CommonAPI.driver, CareersPage.class);
    }

    // Test case 1. Search for Data, Analytics positions


    public void careersButtonClickable() {
        careersPage.clickCareers();
        sleepFor(1);
        String pageSource = driver.getPageSource();

        if (pageSource.indexOf("amazon jobs") != -1)  {
            System.out.println("success. careers button working ");
            getScreenshot(driver);

        } else {
            System.out.println("Failure. careers button not working");
            getScreenshot(driver);
        }

    }
    @Test
    public void teamNavBusinessCorporateDevelopment() {
        careersPage.clickCareers();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"teams\"]/div[1]/h3")).click();
        sleepFor(1);
        String pageSource = driver.getPageSource();
        if (pageSource.indexOf("business") != -1 && pageSource.indexOf("corporate development") != -1) {
            System.out.println("They provide business and corporate development positions");
            getScreenshot(driver);
        } else {
            System.out.println("They don't provide business and corporate development positions");
            getScreenshot(driver);
        }
        sleepFor(1);
    }


}