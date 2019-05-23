import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestOurFirm extends CommonAPI {

    public void AboutUs (){
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/section/div/div/div/div/a")).click();
        sleepFor(1);
    }

    public void InvRel () {
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[4]/section/div/div/div[1]/div/div/a[1]/h4")).click();
        sleepFor(2);
    }

    public void Careers (){
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[5]/div/div[2]/div/div/a")).click();
        sleepFor(2);
    }

    public void Locations () {
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[6]/div/div[2]/div/div/a")).click();
        sleepFor(2);

    }

    public void Button (){
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/section/div/button")).click();
        sleepFor(2);
    }
    @Test
    public void ExcOfficers () {
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section/div/div/div/div/a[2]")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/section[2]/div/div/div[4]/a[2]/h5")).click();
        sleepFor(2);

    }
}

