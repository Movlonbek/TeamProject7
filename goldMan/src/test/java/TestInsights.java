import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestInsights extends CommonAPI {


    //-------------Initializing all the WebElements of Insights page--------------

    @FindBy(xpath = "//*[@id=\"wrapper\"]/footer/section/nav[4]/a[1]")
    public static WebElement overviewClick;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/footer/section/nav[4]/a[3]")
    public static WebElement talksatgs;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/footer/section/nav[4]/a[6]")
    public static WebElement briefly;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/footer/section/nav[4]/a[7]")
    public static WebElement goldmansachsresearch;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/footer/section/nav[4]/a[10]")
    public static WebElement archiev;



    //-------------List of click methods of all the WebElements of Insights page--------------


    public void overviewClick () { overviewClick();
    }

    public void talksatgs(){
        talksatgs.click();
    }
    public void btiefly(){

        briefly.click();
    }
    public void goldmansachsresearch(){
        goldmansachsresearch.click();
    }
    public void archiev(){
        archiev.click();
    }



    public void MoreCathUpDavid(){
    driver.findElement(By.xpath("//*[@id=\"page-content\"]/section[2]/div/div[1]/div[3]/a")).click();
    sleepFor(2);

    }

    }







