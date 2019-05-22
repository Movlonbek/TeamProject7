import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Career extends CommonAPI {


        //-------------Initializing all the WebElements of Career page--------------

        @FindBy(xpath = "//*[@id=\"wrapper\"]/section[1]/div[1]/div/div[1]/a/span")
        public static WebElement proffesionalsClick;
        @FindBy(xpath = "//*[@id=\"wrapper\"]/section[1]/div[1]/div/div[2]/a/span")
        public static WebElement explore;
        @FindBy(xpath = "//*[@id=\"wrapper\"]/section[1]/div[1]/div/div/div/div[3]/a/span")
        public static WebElement prepare;
        @FindBy(xpath = "//*[@id=\"wrapper\"]/section[1]/div[1]/div/div[4]/a/span")
        public static WebElement searchJob;
        @FindBy(xpath = "//*[@id=\"wrapper\"]/section[1]/div[1]/div/div[5]/a/span")
        public static WebElement blog;



        //-------------List of click methods of all the WebElements of Contact Us page--------------


        public void proffesionalsClick(){
           proffesionalsClick.click();
        }

        public void explore(){
            explore.click();
        }
        public void prepare(){
           prepare.click();
        }
        public void searchJob(){
            searchJob.click();
        }
        public void blog(){
            blog.click();
        }


@Test
    public void clickCareers() {
        driver.findElement(By.xpath("//*[@id=\"audience-nav\"]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[1]/section/div/div[2]/a")).click();
        sleepFor(2);
    }

    public void Searchjob(){
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[1]/section/div/div/div[2]/a")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"jsb_f_keywords_i\"]")).sendKeys("Selenium");
        driver.findElement(By.xpath("//*[@id=\"jsb_f_location_s\"]")).sendKeys("New York");
        driver.findElement(By.xpath("//*[@id=\"jsb_form_submit_i\"]")).click();
        sleepFor(2);
    }

    public void Signinportal(){
        driver.findElement(By.xpath("//*[@id=\"footer-student\"]/div/div/div[2]/div/div[2]/div/div/div/div/a")).click();
        sleepFor(2);
    }
public Career careerPage;

       @BeforeMethod
        public void init(){
            careerPage = PageFactory.initElements(driver, Career.class);
        }

        //-------------Test case 1. Search for Data, Analytics positions ---------------


        public void searchJobs(){
            careerPage.searchJobs();
            sleepFor(1);
            String pageSearch = driver.getPageSource();

            if(pageSearch.indexOf("Data") != -1 && pageSearch.indexOf("Analytics") != -1){
                System.out.println("Goldmansachs provides positions at Data and Analytics field ");
            }
            else{
                System.out.println("They dont provide Data and Analytics field");
            }
            sleepFor(1);
        }


}