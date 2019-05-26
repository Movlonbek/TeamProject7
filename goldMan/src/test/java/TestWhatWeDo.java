import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestWhatWeDo extends CommonAPI {

    //-------------Initializing all the WebElements of WhatWeDo--------------

    @FindBy(xpath = "//*[@id=\"wrapper\"]/footer/section/nav[3]/a[1]")
    public static WebElement overview;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/footer/section/nav[3]/a[2]")
    public static WebElement InvestmentBanking;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/footer/section/nav[3]/a[3]")
    public static WebElement InvestmentManagment;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/footer/section/nav[3]/a[4]")
    public static WebElement Investing_Lending;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/footer/section/nav[3]/a[5]")
    public static WebElement Securities;
    @FindBy (xpath = "//*[@id=\"wrapper\"]/footer/section/nav[3]/a[6]")
    public static WebElement Research;


//-------------List of click methods of all the WebElements of WhatWeDo page--------------

    public void overview(){
        overview.click(); }
    public void InvestmentBanking(){
       InvestmentBanking.click(); }
    public void InvetsmentManagment(){
        InvestmentManagment.click(); }
    public void Investing_Lending(){
        Investing_Lending.click(); }
    public void Securities(){
        Securities.click(); }
    public void Research(){
        Research.click(); }

        // ------Test WhatWeDO watch video-------

    public void watchVideo(){
        driver.findElement(By.xpath("//*[@id=\"briefings\"]/div/div/div[2]/div/div[2]/div[2]/div/div[4]/a/i")).click();
        sleepFor(3);
    }

   @Test
    public void SearchJobs(){
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/form/img")).click();
        driver.findElement(By.xpath("//*[@id=\"searchBox\"]")).sendKeys("Jobs");
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/form/img")).click();
        sleepFor(2);
    }


    }

