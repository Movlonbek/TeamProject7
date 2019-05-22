import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


public class HomePage extends CommonAPI {

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

    public void testLogin() {
        WebElement element = driver.findElement(By.linkText("Login"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Goldman.com")).click();
        sleepFor(3);
    }
}
