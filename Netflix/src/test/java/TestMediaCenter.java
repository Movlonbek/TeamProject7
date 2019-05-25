import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMediaCenter extends CommonAPI {
    public MediaCenter mediaCenter;

    @BeforeMethod
    public void init(){
        mediaCenter = PageFactory.initElements(driver, MediaCenter.class);
    }

    //--------------------Test case 1. Testing out register personal information form --------------


    public  void testRegisterPersonal (){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window .scrollBy(0,400)", "");
        sleepFor(2);
        typeByXpath("//*[@id=\"registerForm\"]/div[1]/input[1]", "Mike");
        sleepFor(1);
        typeByXpath("//*[@id=\"registerForm\"]/div[1]/input[2]", "G");
        sleepFor(1);
        typeByXpath("//*[@id=\"registerForm\"]/div[2]/input[1]", "wormike96@gmail.com");
        sleepFor(1);
        typeByXpath("//*[@id=\"registerForm\"]/div[2]/input[2]", "954-494-8376");
        sleepFor(1);
        clickByXpath("//*[@id=\"registerForm\"]/div[4]/select");
        sleepFor(1);
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[4]/select")));
        select.selectByIndex(1);
        sleepFor(1);
        typeByXpath("//*[@id=\"registerForm\"]/div[5]/textarea", "just for lulz");
        sleepFor(1);
        TestLogger.log(getClass().getSimpleName() + "Personal information input was successful");

    }

    //--------------------Test case 2. Testing out register address form--------------


    public void testRegisterAddress(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window .scrollBy(0,400)", "");
        typeByXpath("//*[@id=\"registerForm\"]/div[6]/input[1]", "63-45 Saunders street");
        sleepFor(1);
        typeByXpath("//*[@id=\"registerForm\"]/div[7]/input[1]", "Rego Park");
        sleepFor(1);
        typeByXpath("//*[@id=\"registerForm\"]/div[7]/input[2]", "New York");
        sleepFor(1);
        typeByXpath("//*[@id=\"registerForm\"]/div[8]/input", "11374");
        sleepFor(1);
        clickByXpath("//*[@id=\"countryName\"]");
        sleepFor(1);
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"countryName\"]")));
        select.selectByValue("us");
        sleepFor(1);

    }
    //--------------------Test case 3. Testing out register form--------------


    public void testRegisterForm(){
        testRegisterPersonal();
        testRegisterAddress();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1100)", "");
        sleepFor(1);
        clickByXpath("//*[@id=\"registerForm\"]/button");
        sleepFor(2);
    }

    //--------------------Test case 4. Testing out Press Outlet button--------------


    public void testPressOutlet(){
        mediaCenter.registerClick();
        testRegisterForm();
        sleepFor(1);
        typeByXpath("//*[@id=\"registerForm\"]/div[3]/input[2]", "outlet");
        sleepFor(1);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1100)", "");
        sleepFor(1);
        clickByXpath("//*[@id=\"registerForm\"]/button");
        sleepFor(2);
    }

    //--------------------Test case 4. Testing out Press Outlet button--------------

    @Test

    public void testLoginForm(){
        String expectedValue = "We didn't recognize the username or password you entered. Please try again.";
        mediaCenter.mediaLogInClick();
        typeByXpath("//*[@id=\"user_email\"]", "wormike96@gmail.com");
        typeByXpath("//*[@id=\"user_password\"]", "20062503");
        clickByXpath("//*[@id=\"new_user\"]/div[4]/a[1]");
        sleepFor(1);
        Assert.assertEquals(expectedValue, driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[2]/div")).getText());
        TestLogger.log(getClass().getSimpleName() + "The error message was shown up properly");
    }

}
