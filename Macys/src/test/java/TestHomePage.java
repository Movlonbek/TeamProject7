import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    public void testSearchBox(){
        driver.findElement(By.xpath("//*[@id=\"globalSearchInputField\"]")).sendKeys("Fragnances");
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"searchSubmit\"]")).click();
    }
    @Test
    public void clickImg(){
        driver.findElement(By.xpath("//*[@id=\"row_4\"]/ul/li[2]/div/a/div/picture/img")).click();
        sleepFor(2);
        System.out.println("Wow!Picture works");
    }

    public void testAcoount (){
        driver.findElement(By.xpath("//*[@id=\"sign-in-menu-wrapper\"]")).click();
        sleepFor(2);
    }
}
