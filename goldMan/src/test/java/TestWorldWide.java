import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestWorldWide extends CommonAPI {


    public void clickWorldwide() {
        driver.findElement(By.xpath("//*[@id=\"worldwideNav\"]/a")).click();
        sleepFor(1);
    }
    @Test
    public void clickSeeOfficeLocvations (){
    driver.findElement(By.xpath("//*[@id=\"content\"]/aside/article/figure/figcaption/p[2]/a")).click();
    sleepFor(2);

    }
//-------------Initializing all the WebElements of WorldWide--------------

    @FindBy(xpath = "//*[@id=\"filter_americas\"]")
    public static WebElement americasClick;


//-------------List of click methods of all the WebElements of Americas page--------------

    public void americasClick(){

        americasClick.click();
    }

//-------------SendKeys SingUp Page-----------

    public void SingUp(){
        driver.findElement(By.xpath("//*[@id=\"briefings\"]/div/div/div[2]/div/div[1]/div/div/form/input")).sendKeys("mtojimat@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"briefings\"]/div/div/div[2]/div/div[1]/div/div/form/button")).click();
        sleepFor(3);
    }
}
