import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestHomePage extends CommonAPI {

    public HomePage homePage;


    public void init(){
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    //-----------Testcase 1. Testing if Input error shows up ----------



    public void accountInputError(){
        homePage.clickAccount();
        sleepFor(3);
        homePage.getEmailOrPhone().sendKeys("hi");
        homePage.getSignInPassword().sendKeys("ghgghg");
        sleepFor(5);
        WebElement inputError = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/div[1]/div[2]"));
        if(inputError.isDisplayed()){
            System.out.println("Input Error was displayed. Text: " + inputError.getText() );

        }
        else{
            System.out.println("Failed to show InputError");

        }
        quitDriver();
    }

    //-----------Testcase 2. Testing the error message if login with invalid info ----------



    public void accountValidEmailInput(){
        homePage.clickAccount();
        sleepFor(3);
        homePage.logIn("wormike96@gmail.com", "3047");
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/div/div[2]"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");

        }
        else{
            System.out.println("Failed");

        }
        quitDriver();
    }


    //-----------Testcase 3. Testing the error message if login with invalid phone number info ----------


    public void accountValidPhoneInput(){
        homePage.clickAccount();
        sleepFor(2);
        homePage.logIn("9544948376", "3027");
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/div/div[2]"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");

        }
        else{
            System.out.println("Failed");

        }
        quitDriver();
    }

    //-----------Testcase 4. Testing if Debit or Credit card needs to be provided while creating profile ----------


    public void watchForFreeDebitTest(){
        homePage.clickWatchForFreeButton();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[2]/div/div[2]/button")).click();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[2]/div/div[3]/button")).click();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[2]/div/div[2]/button")).click();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"id_email\"]")).sendKeys("wormike96@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("ww20062503");
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/form/div[2]/button")).click();
        sleepFor(3);
        if(driver.findElement(By.xpath("//*[@id=\"creditOrDebitCardDisplayStringId\"]/a/div")).getText().indexOf("Debit")!=-1){
            System.out.println("They need Credit or Debit card to procced");
        }
        else{
            System.out.println("They dont need Credit or Debit card info");
        }
        System.out.println(driver.getPageSource());
        quitDriver();

    }

    //-----------Testcase 5. Testing if all the plans are clickable ----------


    public void watchForFreeClickableTest(){
        String output;
        String output2;
        homePage.clickWatchForFreeButton();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[2]/div/div[2]/button")).click();
        sleepFor(1);
        WebElement standardPlan =driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[2]/div/div[1]/div[2]/div/div/label[2]/span"));
        WebElement basicPlan =driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[2]/div/div[1]/div[2]/div/div/label[1]/span"));
        standardPlan.click();
        sleepFor(1);
        if(standardPlan.isEnabled()){
            output = "Standard plan is clickable";
        }
        else{
            output = "Standard plan is not clickable";
        }
        basicPlan.click();
        sleepFor(1);
        if(basicPlan.isEnabled()){
            output2 = "Basic plan is clickable";
        }
        else{
            output2 = "Basic plan is not clickable";
        }
        System.out.println(output + " " + output2);
        quitDriver();
    }


    //-----------Testcase 6. Testing if all the pictures  are clickable ----------



    public void watchAnywhereButton(){
        String output;
        homePage.clickWatchAnywhereButton();
        sleepFor(3);

        WebElement picture = driver.findElement(By.xpath("//*[@id=\"this-is-netflix\"]/div[3]/div[2]/div/div[2]/div[3]/div[1]/img"));
        picture.click();
        if(picture.isEnabled()){
            output = "Pictures are clickable";
        }
        else {
            output = "Pictures are not clickable";
        }
        sleepFor(1);
        System.out.println(output);
        quitDriver();
    }


    //-----------Testcase 7. Check Pick your Price button on the homepage ----------



    public void pickYourPriceTest(){
        homePage.clickPickYourPrice();
        sleepFor(1);
        System.out.println(driver.getPageSource());
        sleepFor(1);
        quitDriver();
    }


    //-----------Testcase 8. Testing Contact Us button and waiting for modal window to pop up ----------


    public void contactUsTestCaseModalWindow(){
        boolean modalDisplayed= false;
        homePage.clickContactUs();
        sleepFor(3);
        WebElement modalWindow = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div"));
        if(modalWindow.isDisplayed()){
            modalDisplayed = true;

        }
        else{
            modalDisplayed = false;
        }
        Assert.assertTrue(modalDisplayed);
        System.out.println("Test case succeeded");
    }

    //-----------Testcase 9. Testing Contact Us and testing phone number button ----------


    public void contactUsTestCasePhoneNumber(){
        homePage.clickContactUs();
        sleepFor(3);
        WebElement modalWindow = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div"));
        WebElement closeModal = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/button"));
        closeModal.click();
        driver.findElement(By.xpath("//*[@id=\"phoneContactTrigger\"]")).click();
        sleepFor(1);
        Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"phone-contact\"]/div/div/div/div[2]/div/div/a")).getText().contains("[a-zA-Z]"));
        System.out.println("Phone number is provided");

    }


    //-----------Testcase 10. Testing Contact Us and testing phone number button ----------


    public void contactUsTestCaseLiveChat(){
        String expectedMenu1 = "I cannot find a TV show or movie on Netflix";
        String expectedMenu2 = "I need to reset my password";
        String expectedMenu3 = "I need to update my payment method";
        homePage.clickContactUs();
        sleepFor(3);
        WebElement modalWindow = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div"));
        WebElement closeModal = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/button"));
        closeModal.click();
        driver.findElement(By.xpath("//*[@id=\"startChatTrigger\"]")).click();
        sleepFor(1);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedMenu1, driver.findElement(By.xpath("//*[@id=\"selfHelpPopover\"]/div[2]/ul[1]/li[1]/a")).getText());
        softAssert.assertEquals(expectedMenu2, driver.findElement(By.xpath("//*[@id=\"selfHelpPopover\"]/div[2]/ul[1]/li[2]/a")).getText());
        Assert.assertEquals(expectedMenu3, driver.findElement(By.xpath("//*[@id=\"selfHelpPopover\"]/div[2]/ul[1]/li[3]/a")).getText());
        System.out.println("All tests are successful");

    }

    //-----------Testcase 11. Testing Help Center and search box ----------


    public void helpCenterTestCase(){
        homePage.clickHelpCenter();
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys("Cant watch my movie");
        driver.findElement(By.xpath("//*[@id=\"search-placeholder\"]/form/div/div/div[1]/button"));
        sleepFor(1);
        quitDriver();
    }

    //-----------Testcase 12. Testing Language Picker on the homepage  ----------


    public void languagePickerTestCaseLanguages(){
        String expectedLang1 = "English";
        String expectedLang2 = "Español";
        homePage.clickLanguagePicker();
        sleepFor(1);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedLang1, driver.findElement(By.xpath("//*[@id=\"undefined-select\"]/option[1]")).getText());
        Assert.assertEquals(expectedLang2, driver.findElement(By.xpath("//*[@id=\"undefined-select\"]/option[2]")).getText());

    }

    //-----------Testcase 13. Testing Language Picker on the homepage and changing language  ----------


    public void languagePickerChangeToSpanish(){
        String expectedString = "Tu próxima historia, ahora.\n" +
                "DISFRUTA DONDE QUIERAS. CANCELA CUANDO QUIERAS.";
        homePage.clickLanguagePicker();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"undefined-select\"]/option[2]")).click();
        sleepFor(1);
        Assert.assertEquals(expectedString, driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div[1]")).getText());
        System.out.println("Language was changed successfully");
    }

    //-----------Testcase 14. Testing FAQ  on the homepage  ----------


    public void faqTestCase(){
        homePage.clickFAQ();
        sleepFor(2);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/ul/li/a")).click();
        sleepFor(1);
        quitDriver();
    }

    //-----------Testcase 15. Testing Jobs one the homepage  ----------

    public void jobsTestCaseLogo(){
        WebElement netflixLogo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[1]"));

        homePage.clickJobs();
        sleepFor(3);
        WebElement netflixJobsLogo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/section/div[1]/div/a"));
        sleepFor(1);
        if(!netflixJobsLogo.getText().equalsIgnoreCase(netflixLogo.getText())){
            System.out.println("Netflix logo changed accordungly");
        }
        quitDriver();
    }

    //-----------Testcase 16. Testing Jobs one the homepage and searchbox  ----------

    public void jobsTestCaseSearchBox(){
        homePage.clickJobs();
        driver.findElement(By.xpath("//*[@id=\"autocomplete-input\"]")).sendKeys("QA Tester");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[1]/div[1]/div/div/button")).click();
        sleepFor(5);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[1]/div[1]/div/div/button")).isEnabled());

    }


    //-----------Testcase 17. Testing Jobs one the homepage and searchbox jobs  ----------


    public void jobsTestCaseSearchBoxJobs(){
        homePage.clickJobs();
        sleepFor(2);
        driver.findElement(By.xpath(" //*[@id=\"__next\"]/div/header/section/div[1]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"autocomplete-input\"]")).sendKeys("QA tester");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div/button")).click();
        sleepFor(1);
        String countJobs = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div[1]/p/em")).getText();
        if(Integer.valueOf(countJobs)>0) {
            System.out.println("They have some QA Tester positions");
        }
        quitDriver();
    }

    //-----------Testcase 18. Testing Jobs one the homepage and searchbox jobs  ----------

    public void signInButtonTestCase(){
        homePage.clicksignInButton();
        sleepFor(1);
        homePage.logIn("wormike96@gmail.com", "3047");
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/div/div[2]"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");

        }
        else{
            System.out.println("Failed");

        }
        quitDriver();
    }
}