import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestCitizenship extends CommonAPI {
@Test
    public void Citizenship(){
        driver.findElement(By.xpath("//*[@id=\"marketing-nav\"]/li[5]/a")).click();
        sleepFor(2);
}
//-------------Initializing all the WebElements of Citizenship--------------

    @FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/section/div/div/div/div/a[1]")
    public static WebElement smallBussinesUS;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/div[3]/section/div/div/div/div/a")
    public static WebElement G_SH_Gives;
    @FindBy(xpath = "//*[@id=\"wrapper\"]/section[4]/div/div/div/div/a")
    public static WebElement Community_teamwork;


//-------------List of click methods of all the WebElements of Citizenship page--------------

    public void smallBussinesUS(){
        smallBussinesUS.click(); }
    public void G_SH_Gives(){
        G_SH_Gives.click(); }
    public void Community_teamwork(){
        Community_teamwork.click(); }

}
