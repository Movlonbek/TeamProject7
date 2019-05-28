package regressionSuite;

import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.PrimeVideo;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class TestPrimeVideo extends CommonAPI {
    public PrimeVideo primeVideo;

    @BeforeMethod
    public void init() {
        primeVideo = PageFactory.initElements(CommonAPI.driver, PrimeVideo.class);

    }
    // case 1. find out prime video

    public void findPrimeVideoFromMenu() {
        primeVideo.clickScrollDownMenu();
        sleepFor(1);
        primeVideo.clickPrimeVideo();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a")).isDisplayed();
        System.out.println("passed");
    }
    // case 2. search video

    public void searchPrimeVideos() {
        primeVideo.clickScrollDownMenu();
        sleepFor(1);
        primeVideo.clickPrimeVideo();
        sleepFor(1);
        clickByXpath("//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("avengers endgame", Keys.ENTER);
        sleepFor(2);
    }
    // test 3.

    public void testPrimeVideosWatchlist(){
        List<WebElement> list = new ArrayList<WebElement>();
        primeVideo.clickScrollDownMenu();
        sleepFor(1);
        primeVideo.clickPrimeVideo();
        sleepFor(1);
        list = getListOfWebElementsByXpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a/div");
        sleepFor(1);
        TestLogger.log(getClass().getSimpleName() + " : The List of Prime videos accessed if member is: " + getListOfString(list));

    }
    //test 4.

    public void testPrimeVideosWatch() {
        List<WebElement> list = new ArrayList<WebElement>();
        primeVideo.clickScrollDownMenu();
        sleepFor(1);
        primeVideo.clickPrimeVideo();
        sleepFor(1);
        list = getListOfWebElementsByXpath("//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a/div");
        sleepFor(1);
        TestLogger.log(getClass().getSimpleName() + " : The List of Prime videos accessed if member is: " + getListOfString(list));

    }
    //test 5.
    public void testAmazonOriginals() {
        List<WebElement> list = new ArrayList<WebElement>();
        primeVideo.clickScrollDownMenu();
        sleepFor(1);
        primeVideo.clickPrimeVideo();
        sleepFor(1);
        list = getListOfWebElementsByXpath("//*[@id=\"hmenu-content\"]/ul[1]/li[13]/a/div");
        sleepFor(1);
        TestLogger.log(getClass().getSimpleName() + " : The List of Prime videos accessed if member is: " + getListOfString(list));

    }
    //test 6.

    public void watchFreeTrailer() {
        primeVideo.clickScrollDownMenu();
        sleepFor(1);
        primeVideo.clickPrimeVideo();
        sleepFor(1);
        clickByXpath("//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("the wolf of wall street", Keys.ENTER);
        sleepFor(1);
        clickByXpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/span/a/div/img");
        sleepFor(1);
        clickByXpath("//*[@id=\"dv-action-box\"]/div/div[2]/a");
        sleepFor(30);
        System.out.println("video working properly");



    }







}
