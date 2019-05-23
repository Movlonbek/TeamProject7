import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCarrers extends CommonAPI {



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
}
