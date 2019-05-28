package regressionSuite;


import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.CareersAmazon;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class TestCareersAmazon extends CommonAPI {
    public CareersAmazon amazonJobs;

    @BeforeMethod
    public void init() {
        amazonJobs = PageFactory.initElements(CommonAPI.driver, CareersAmazon.class);
    }

    // Test case 1. check careers button clickable
    public void careersButtonClickable() {
        amazonJobs.clickCareers();
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
    //test case 2. check teams nav button working

    public void teamNavButton() {
        amazonJobs.clickCareers();
        sleepFor(1);
        amazonJobs.clickTeamsNavButton();
        sleepFor(1);
        String pageSource = driver.getPageSource();
        if (pageSource.indexOf("Find jobs by team") != -1)  {
            System.out.println("success. Teams button working");
            getScreenshot(driver);
        } else {
            System.out.println("failure. teams button not working");
            getScreenshot(driver);
        }
        sleepFor(1);
    }
    //test 3. check amazon provide business and corporate development positions

    public void teamNavButtoncorporate() {
        amazonJobs.clickCareers();
        sleepFor(1);
        amazonJobs.clickTeamsNavButton();
        sleepFor(1);
        String text = driver.findElement(By.cssSelector("#business-categories > div.container.collection-tiles > div > div > div > div:nth-child(8) > a > div > div.title > h3")).getText();
        System.out.println(text);
    }
    //test 4. check amazon provide digital entertainment

    public void DigitalEntertainment() {
        amazonJobs.clickCareers();
        sleepFor(1);
        amazonJobs.clickTeamsNavButton();
        sleepFor(1);
        String text = driver.findElement(By.cssSelector("#business-categories > div.container.collection-tiles > div > div > div > div:nth-child(10) > a > div > div.title > h3")).getText();
        System.out.println(text);
    }

    //test 5. check amazon drop down menu by id

    public void testingAmazonJobsDropDown() {
        amazonJobs.clickCareers();
        sleepFor(1);
        amazonJobs.clickTeamsNavButton();
        sleepFor(1);
        amazonJobs.clickAmazonJobsDropDown();
        sleepFor(2);
        String text = driver.findElement(By.id("nav-item-job-categories")).getText();
        System.out.println(text);
    }
    //test case 6.  check amazon jobs location

    public void testingAmazonJobsLocations() {
        amazonJobs.clickCareers();
        sleepFor(1);
        amazonJobs.clickTeamsNavButton();
        sleepFor(1);
        amazonJobs.clickAmazonJobsDropDown();
        sleepFor(2);
        amazonJobs.clickAmazonJobsLocations();
        if(driver.findElement(By.xpath("//*[@id=\"nav-item-locations\"]/div/a")).isEnabled()){
            TestLogger.log(getClass().getSimpleName() + " : Locations button is running properly");
        }
        else{
            TestLogger.log(getClass().getSimpleName() + " : Locations button is not  running properly");
        }
    }
    //test 7. test amazon has a location in Hempstead England

    public void testingAmazonJobsLocationsEngland() {
        amazonJobs.clickCareers();
        sleepFor(1);
        amazonJobs.clickTeamsNavButton();
        sleepFor(1);
        amazonJobs.clickAmazonJobsDropDown();
        sleepFor(1);
        amazonJobs.clickAmazonJobsLocations();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"hertfordshire-hemel-hempstead-england\"]/a/div")).click();
        sleepFor(2);
        if(driver.findElement(By.xpath("//*[@id=\"location\"]")).isDisplayed()){
            TestLogger.log(getClass().getSimpleName() + " : Amazon has a jobLocation in Hempstead England");
        }
        else{
            TestLogger.log(getClass().getSimpleName() + " : Amazon don't have a jobLocation in Hempstead England");
        }
    }

    //test 8. find region

    public void testingAmazonJobsCountLocationsEngland() {
        amazonJobs.clickCareers();
        sleepFor(1);
        amazonJobs.clickTeamsNavButton();
        sleepFor(1);
        amazonJobs.clickAmazonJobsDropDown();
        sleepFor(1);
        amazonJobs.clickAmazonJobsLocations();
        sleepFor(1);
        List<String> items = new ArrayList<String>();
        items.add( driver.findElement(By.xpath("//*[@id=\"leeds-england\"]/a/div/div/div/p")).getText());
        System.out.println(items);

    }
    //test 9. find out a all locations

    public void findOutAllLocations() {
        amazonJobs.clickCareers();
        sleepFor(1);
        amazonJobs.clickTeamsNavButton();
        sleepFor(1);
        amazonJobs.clickAmazonJobsDropDown();
        sleepFor(1);
        amazonJobs.clickAmazonJobsLocations();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"locations.index.continents.all\"]/p")).click();
        sleepFor(1);
        driver.switchTo().defaultContent();
        sleepFor(2);
        System.out.println("success");

    }





}