import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class TestContactUs extends CommonAPI {

    ContactUs contactUs;


    @BeforeMethod
    public void init(){
        contactUs = PageFactory.initElements(driver,ContactUs.class);
    }



    //-------------Test case 1. Sign in button with invalid info---------------


    public void signInButtonTestCaseInvalid(){
        contactUs.closeModalWindow();
        contactUs.signInButtonClick();
        sleepFor(5);
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("hello");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("347");
        sleepFor(2);
        WebElement inputError = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/div[1]/div[2]"));
        if(inputError.isDisplayed()){
            System.out.println("Input Error was displayed. Text: " + inputError.getText() );
        }
        else{
            System.out.println("Failed to show InputError");
        }

    }


    //-------------Test case 2. Sign in button with valid info---------------


    public void accountValidEmailInput(){
        contactUs.closeModalWindow();
        contactUs.signInButtonClick();


        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("wormike96@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("55689");
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/div/div[2]"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");
        }
        else{
            System.out.println("Failed");
        }

    }

    //-------------Test case 3. Sign in button with valid phone number  info---------------


    public void accountValidPhoneInput(){
        contactUs.closeModalWindow();
        contactUs.signInButtonClick();


        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("9544948376");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("55689");
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/div/div[2]"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");
        }
        else{
            System.out.println("Failed");
        }

    }

    //-------------Test case 4. Sign in button with invalid password info---------------


    public void accountInValidPasswordInput(){
        contactUs.closeModalWindow();
        contactUs.signInButtonClick();


        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("9544948376");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("556");
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
        sleepFor(1);
        WebElement passwordTooShort = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/div[2]/div[2]"));
        if (passwordTooShort.isDisplayed()){
            System.out.println("Success. Message was shown up");
        }
        else{
            System.out.println("Failed");
        }

    }


    //-------------Test case 5. Checking if helpful article provided ---------------


    public void searchBoxNavToArticle(){
        contactUs.closeModalWindow();
        sleepFor(1);
        contactUs.searchBoxSendKeys("Why isnt Netflix working?");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/div/div[2]/button[2]")).click();
        sleepFor(3);
        if(driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/div")).isDisplayed()){
            System.out.println("Success. Message was shown up");
        }
        else{
            System.out.println("Fail.Message was not shown up");
        }

    }

    //-------------Test case 6. Checking if helpful article provided ---------------

    public void searchBoxNavToArticleYes(){
        contactUs.closeModalWindow();
        sleepFor(1);
        contactUs.searchBoxSendKeys("Why isnt Netflix working?");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/div/div[2]/button[1]")).click();
        sleepFor(3);
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/form/div/textarea")).sendKeys("Thank you! You article was useful");
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/form/button")).click();

        System.out.println("Success. Message was shown up. Message was sent");

    }

    //-------------Test case 7. Checking if valid US phone number provided to call Customer Service , example 1-999-999-9999---------------


    public void phoneNumberTestCase(){
        contactUs.closeModalWindow();
        contactUs.callUsClick();
        sleepFor(1);

        String phoneNumber = driver.findElement(By.xpath("//*[@id=\"phone-contact\"]/div/div/div/div[2]/div/div/a")).getText();

        if(phoneNumber.length()==14 &&(!phoneNumber.contains("[a-aZ-Z]")) ){
            System.out.println("Phone Number was provided : "+phoneNumber);
        }
        else{
            System.out.println("Phone Number was not provided or is incorrect");
        }

    }

    //-------------Test case 8. Checking if NetFlix provides email support to fix problems---------------


    public void liveChatEmailSupport(){
        contactUs.closeModalWindow();
        contactUs.startLiveChatClick();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"selfHelpPopover\"]/div[2]/ul[1]/li[2]/a")).click();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[2]/div/label/input")).sendKeys("wormike96@gmail.com");
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/button")).click();
        sleepFor(2);
    }

    //-------------Test case 9. Checking if languages switch works---------------


    public void langSwitchTestCase() {
        String expectedString = "Comunícate con el Servicio al Cliente";

        contactUs.closeModalWindow();
        contactUs.langSwicthClick();
        sleepFor(1);


        driver.findElement(By.xpath("//*[@id=\"lang-switcher\"]/option[5]")).click();
        sleepFor(1);
        Assert.assertEquals(expectedString, driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/section[1]/h1")).getText());
        System.out.println("Language was changed successfully");
    }

    //-------------Test case 10. Checking if languages switch works---------------



    public void articleTestCase(){
        contactUs.closeModalWindow();
        contactUs.articleClick();
        sleepFor(2);
    }
}
