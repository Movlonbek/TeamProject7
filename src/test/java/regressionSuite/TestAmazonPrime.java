package regressionSuite;

import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.AmazonPrime;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;


public class TestAmazonPrime extends CommonAPI {
    public AmazonPrime amazonPrime;

    @BeforeMethod
    public void init() {
        amazonPrime = PageFactory.initElements(CommonAPI.driver, AmazonPrime.class);

    }
    //test 1.

    public void tryPrime() {
        amazonPrime.clickAmazonPrime();
        sleepFor(1);
        driver.findElement(By.className("prime-cta-signup-button-input")).click();
        sleepFor(1);
        String pageSource = driver.getPageSource();
        if (pageSource.indexOf("Sign In") != -1)  {
            System.out.println("success. Try prime working");
        } else {
            System.out.println("failure. try prime not working");

        }
    }
    // test 2.

    public void primePlansBasic() {
        amazonPrime.clickAmazonPrime();
        sleepFor(1);
        amazonPrime.clickPrimePlans();
        sleepFor(1);
        List<WebElement> list = new ArrayList<>();
        list = getListOfWebElementsByXpath("//*[@id=\"plan-cards-container\"]/div[1]/label/div/div/div[3]/div[1]");
        sleepFor(2);
        TestLogger.log(getClass().getSimpleName() + " : The lists of basic plans you can purchase monthly $8.99 : " + getListOfString(list));
        sleepFor(1);
    }
    //test 3.

    public void primePlansMonthly() {
        amazonPrime.clickAmazonPrime();
        sleepFor(1);
        amazonPrime.clickPrimePlans();
        sleepFor(1);
        List<WebElement> list = new ArrayList<>();
        list = getListOfWebElementsByXpath("//*[@id=\"plan-cards-container\"]/div[2]/label/div/div/div[3]");
        sleepFor(2);
        TestLogger.log(getClass().getSimpleName() + " : The lists of monthly plans you can purchase  $12.99/month : " + getListOfString(list));
        sleepFor(1);
    }
    //test 4.

    public void primePlansAnnually() {
        amazonPrime.clickAmazonPrime();
        sleepFor(1);
        amazonPrime.clickPrimePlans();
        sleepFor(1);
        List<WebElement> list = new ArrayList<>();
        list = getListOfWebElementsByXpath("//*[@id=\"best-offer-card\"]/div[1]/label/div/div/div[4]");
        sleepFor(2);
        TestLogger.log(getClass().getSimpleName() + " : The lists of annual plans you can purchase 119/year : " + getListOfString(list));
        sleepFor(1);
    }

    //test 5.

    public void primeFreeTrial() {
        amazonPrime.clickAmazonPrime();
        sleepFor(1);
        amazonPrime.clickPrimePlans();
        sleepFor(1);
        clickByXpath("//*[@id=\"a-autoid-0\"]/span/input");
        sleepFor(1);
        String pageSource = driver.getPageSource();
        if (pageSource.indexOf("Sign In") != -1)  {
            System.out.println("success. one month free trial working");
        } else {
            System.out.println("failure. one month free trial not working");

        }

    }
    //test 6.

    public void primeForStudent() {
        amazonPrime.clickAmazonPrime();
        sleepFor(1);
        amazonPrime.clickPrimePlans();
        sleepFor(1);
        clickOnElement("//*[@id=\"after-button-redirects\"]/a[1]");
        sleepFor(1);
        clickOnElement("//*[@id=\"a-autoid-0\"]/span/input");
        sleepFor(1);
        String pageSource = driver.getPageSource();
        if (pageSource.indexOf("Sign In") != -1)  {
            System.out.println("success. six months free trial working");
        } else {
            System.out.println("failure. six months free trial not working");

        }

    }
    //test 7.

    public void primeStudentMonthlyPrice() {
        amazonPrime.clickAmazonPrime();
        sleepFor(1);
        amazonPrime.clickPrimePlans();
        sleepFor(1);
        clickOnElement("//*[@id=\"after-button-redirects\"]/a[1]");
        sleepFor(1);
        clickOnElement("//*[@id=\"popover-button\"]/span/input");
        sleepFor(1);
        String text = driver.findElement(By.xpath("//*[@id=\"plan-comparison\"]/fieldset/table/thead/tr[3]/td[2]")).getText();
        System.out.println(text);

    }
    //test 8.

    public void primeStudentAnnualPrice() {
        amazonPrime.clickAmazonPrime();
        sleepFor(1);
        amazonPrime.clickPrimePlans();
        sleepFor(1);
        clickOnElement("//*[@id=\"after-button-redirects\"]/a[1]");
        sleepFor(1);
        clickOnElement("//*[@id=\"popover-button\"]/span/input");
        sleepFor(1);
        String text = driver.findElement(By.xpath("//*[@id=\"plan-comparison\"]/fieldset/table/thead/tr[3]/td[3]")).getText();
        System.out.println(text);
    }
    //test 9.
    @Test
    public void primeForEBTorMedicaid() {
        amazonPrime.clickAmazonPrime();
        sleepFor(1);
        amazonPrime.clickPrimePlans();
        sleepFor(1);
        clickOnElement("//*[@id=\"after-button-redirects\"]/a[2]");
        sleepFor(1);

    }


}


