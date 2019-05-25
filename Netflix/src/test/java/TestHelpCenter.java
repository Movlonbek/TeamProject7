import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHelpCenter extends CommonAPI {

    public HelpCenter helpcenter;

    @BeforeMethod
    public void init(){
        helpcenter = PageFactory.initElements(driver, HelpCenter.class);
    }

    //-------------Test case 1. Search for help in the searchbox input ---------------


    public void searchBoxInputTestCaseHelp(){
        helpcenter.closeModalWindowHelp();
        helpcenter.searchButtonHelpSendKeys("Netflix is not working");
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/div/div[2]/button[2]")).click();
        sleepFor(3);
        if(driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/div")).isDisplayed()){
            TestLogger.log(getClass().getSimpleName() + "Success, Message was shown up");
        }
        else{
            TestLogger.log(getClass().getSimpleName() + "Failed. Message wasnt shown up");
        }

    }

    //-------------Test case 2. Search for help in the search box input---------------


    public void searchBoxInputTestCaseHelpYes(){
        helpcenter.closeModalWindowHelp();
        sleepFor(1);
        helpcenter.searchButtonHelpSendKeys("Why isnt Netflix working");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/div/div[2]/button[1]")).click();
        sleepFor(3);
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/form/div/textarea")).sendKeys("Thank you! You article was useful");
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/form/button")).click();

        TestLogger.log(getClass().getSimpleName() + "Success. Message was shown up. Message was sent");

    }

    //-------------Test case 3. Testing out phone number features---------------

    public void phoneNumberTestCaseHelp() {
        helpcenter.closeModalWindowHelp();
        helpcenter.callHelpButtonClick();
        sleepFor(1);

        String phoneNumber = driver.findElement(By.xpath("//*[@id=\"phone-contact\"]/div/div/div/div[2]/div/div/a")).getText();

        if (phoneNumber.length() == 14 && (!phoneNumber.contains("[a-aZ-Z]"))) {
            TestLogger.log(getClass().getSimpleName() + "Phone number is provided :" + phoneNumber);
        } else {
            TestLogger.log(getClass().getSimpleName() + "Phone number is not provided");
        }
    }

    //-------------Test case 4. Testing out phone live chat features---------------


    public void liveChatEmailSupportHelp(){
        helpcenter.closeModalWindowHelp();
        helpcenter.liveChatButtonClick();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"selfHelpPopover\"]/div[2]/ul[1]/li[2]/a")).click();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[2]/div/label/input")).sendKeys("wormike96@gmail.com");
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/button")).click();
        sleepFor(2);
    }

    //-------------Test case 5. Testing out Can`t Sign in Help support. Still needs some work---------------

    @Test

    public void cantSignInHelpTestCase(){
        helpcenter.closeModalWindowHelp();
        helpcenter.cantSignInHelpClick();
        sleepFor(2);

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div/div[1]/p[2]/a")).click();
        sleepFor(5);
        for (String winHadle : driver.getWindowHandles()){
            driver.switchTo().window(winHadle);
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div/div[2]/div/div[1]/div[1]/h2/a")).click();

        sleepFor(1);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/section/div/div/div[2]/div/div[1]/div[2]/div/div/ol[1]/li[1]/p/a")).click();
        sleepFor(5);
        for (String winHadle : driver.getWindowHandles()){
            driver.switchTo().window(winHadle);
        }
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[2]/div/label/input")).sendKeys("wormike96@gmail.com");
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/button")).click();
        sleepFor(2);

    }

    //-------------Test case 6. Testing out reset password---------------


    public void resetPasswordTestCaseHelp(){
        helpcenter.closeModalWindowHelp();
        helpcenter.resetPasswordHelpClick();
        sleepFor(4);


        for (String winHadle : driver.getWindowHandles()){
            driver.switchTo().window(winHadle);
        }
        sleepFor(5);
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("wormike96@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("20062503");
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
        sleepFor(2);
    }

    //-------------Test case 7. Testing out email update ---------------

    public void updateEmailTestCaseHelp(){
        String winBef = driver.getWindowHandle();

        helpcenter.closeModalWindowHelp();
        helpcenter.updateEmailHelp();
        sleepFor(5);
        for (String winHadle : driver.getWindowHandles()){
            driver.switchTo().window(winHadle);
        }
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("wormike96@gmail.com");
        driver.findElement(By.id("id_password")).sendKeys("20062503");
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
        sleepFor(2);
    }

    //-------------Test case 8. Testing out payment update--------------


    public void updatePaymentTestCaseHelp(){
        String winBef = driver.getWindowHandle();

        helpcenter.closeModalWindowHelp();
        helpcenter.updatePaymentMethodClick();
        sleepFor(5);
        for (String winHadle : driver.getWindowHandles()){
            driver.switchTo().window(winHadle);
        }
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("wormike96@gmail.com");
        driver.findElement(By.id("id_password")).sendKeys("20062503");
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
        sleepFor(2);
    }
}
