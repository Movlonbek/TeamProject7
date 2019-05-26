import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {


    public void clickOurFirm() {
        driver.findElement(By.xpath("//*[@id=\"marketing-nav\"]/li[2]/a")).click();
        sleepFor(1);
    }

    public void clickWhatWeDo() {
        driver.findElement(By.xpath("//*[@id=\"marketing-nav\"]/li[3]/a")).click();
        sleepFor(2);
    }

    public void clickInsights() {
        driver.findElement(By.xpath("//*[@id=\"marketing-nav\"]/li[4]/a")).click();
        sleepFor(2);
    }

    public void clickCitezenship() {
        driver.findElement(By.xpath("//*[@id=\"marketing-nav\"]/li[5]/a")).click();
        sleepFor(2);
    }

    public void clickCareers() {
        driver.findElement(By.xpath("//*[@id=\"audience-nav\"]/li[1]/a")).click();
        sleepFor(2);
    }

    public void clickWatchVideo() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div/div[2]/div/div/a")).click();
    }


    public void Login() {

        driver.findElement(By.xpath("//*[@id=\"loginNav\"]/a")).click();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"loginNav\"]/ul/li[1]/ul/li[2]/a")).click();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"gsid-masked\"]")).sendKeys("Username");
        driver.findElement(By.xpath("//*[@id=\"gspw\"]")).sendKeys("Password");
        driver.findElement(By.xpath("//*[@id=\"gsLoginForm\"]/ul/li[5]/button")).click();
        sleepFor(1);
    }
}
