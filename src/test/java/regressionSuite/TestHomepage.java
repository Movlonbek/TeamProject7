package regressionSuite;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import regression.Homepage;
import reporting.TestLogger;

public class TestHomepage  extends Homepage {
    Homepage homePage;


    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, Homepage.class);
    }

    //Testcase 1. Testing if Input error shows up

    public void accountInputError() {
        homePage.clickAccount();
        sleepFor(1);
        homePage.getEmailOrNumber().sendKeys("myemail@gmail.com");
        homePage.getSignInPasswordT().sendKeys("password");
        sleepFor(1);
        signInfromSignInButton.click();
        WebElement inputError = driver.findElement(By.xpath("//*[@id=\"auth-warning-message-box\"]/div"));
        if (inputError.isDisplayed()) {
            System.out.println("Input Error was displayed. Text: " + inputError.getText());

        } else {
            System.out.println("Failed to show InputError");
        }

    }

    //Testcase 2. Testing the error message if login with invalid info

    public void accountValidEmailInput(){
        homePage.clickAccount();
        sleepFor(3);
        homePage.signIn("myemail@gmail.com", "password");
        sleepFor(1);
        signInfromSignInButton.click();
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"auth-warning-message-box\"]/div"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");

        }
        else{
            System.out.println("Failed");

        }
    }

    //Testcase 3. Testing the error message if login with invalid phone number info


    public void accountValidPhoneInput(){
        homePage.clickAccount();
        sleepFor(2);
        homePage.getEmailOrNumber().sendKeys("3347-xxx-xxxx");
        homePage.getSignInPasswordT().sendKeys("password");
        sleepFor(1);
        signInfromSignInButton.click();
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");

        }
        else{
            System.out.println("Failed");
        }
    }
    //Testcase 4. Testing the error message if login with invalid password


    public void accountValidPasswordInput(){
        homePage.clickAccount();
        sleepFor(3);
        homePage.signIn("myemail@gmail.com", "password");
        sleepFor(1);
        signInfromSignInButton.click();
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"auth-warning-message-box\"]/div"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");
        }
        else{
            System.out.println("Failed");
        }
    }


    //Testcase 5. Testing sign in button


    public void signInButtonTest(){
        homePage.clickAccount();
        sleepFor(1);
        homePage.signIn("myemail@gmail.com", "password");
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        }
        else{
            System.out.println("Failed");
            getScreenshot(driver);
        }

    }



    //Testcase 6. Testing creating amazon account

    public void createAmazonAccount() {
        homePage.clickAccount();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("xyz");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("myemail@gmail.com");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("password");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        sleepFor(3);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"auth-warning-message-box\"]/div"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");

        }
        else{
            System.out.println("Failed");

        }
    }
    //Testcase 7. Check orders on homepage


    public void HomepageOrders(){
        homePage.clickOrders();
        sleepFor(1);
        signInfromSignInButton.click();
        sleepFor(1);
        System.out.println(driver.getPageSource());
        sleepFor(1);
        getScreenshot(driver);
    }

    //Testcase 8. Check Try prime on homepage

    public void TryPrime(){
        homePage.clickTryPrime();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"prime-header-CTA\"]/span/input")).click();
        sleepFor(1);
        signInfromSignInButton.click();
        System.out.println("success");
        getScreenshot(driver);
    }

    //Testcase 9. Check add to cart on homepage


    public void addToCart(){
        homePage.clickCart();
        sleepFor(1);
        if(driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/h1")).getText().indexOf("Your Shopping Cart is empty")!=-1){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        } else {
            System.out.println("Failed");
            getScreenshot(driver);
        }
    }

    //Testcase 10. Check search box on homepage

    public void searchBoxTest(){
        homePage.clearSearchBox();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("anything you want");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        sleepFor(1);
        System.out.println("success. new page opened");
        getScreenshot(driver);
    }

    //Testcase 11. Check deals Of The Day on homepage

    public void dealsOfTheDay(){
        homePage.ClickShopDealsOfTheDay();
        sleepFor(1);
        if(driver.findElement(By.xpath("//*[@id=\"gbox-item-0.0.0\"]/div/div/div[1]/h1/div[1]")).getText().indexOf("Today's Deals")!=-1){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        } else {
            System.out.println("Failed");
            getScreenshot(driver);
        }
    }
    //testcase 12. check language clickable

    public void clickLanguagePage() {
        homePage.clickLanguageSetting();
        sleepFor(1);
        if(driver.findElement(By.xpath("//*[@id=\"lop-heading\"]")).getText().indexOf("Language Settings")!=-1){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        } else {
            System.out.println("Failed");
            getScreenshot(driver);
        }
    }
    //testcase 13. check change language setting working

    public void changeLanguageSettings() {
        homePage.clickLanguageSetting();
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/span")).click();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"icp-btn-save\"]/span/input")).click();
        sleepFor(1);
        System.out.println(driver.getPageSource());
    }
    //testcase 14. checking sign in  button

    public void signInButtonTestCase() {
        String status;
        homePage.clickAccount();
        sleepFor(1);
        homePage.signIn("myemail@gmail.com", "password");
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
        if (errorLoginFail.isDisplayed()) {

            status = "Success. Message was shown";
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));

        } else {
            status = "Failed. Message was not shown ";
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));

        }
        TestLogger.log(getClass().getSimpleName() + ":" + status);
        System.out.println(status);;
    //test case 15. checking amazon logo
    }

    public void amazonTestCaseLogo() {
        homePage.clickAmazonLogo();
        sleepFor(3);
        for (String winHadle : driver.getWindowHandles()) {
            driver.switchTo().window(winHadle);
        }
        WebElement amazonLogo = driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[1]/span[1]"));
        sleepFor(1);
        if (!amazonLogo.getText().equalsIgnoreCase(amazonLogo.getText())) {
            System.out.println("amazon logo changed accordungly");
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
        }
        else {
            System.out.println("amazon logo stays stable");
        }

    }
    //test case 16. check scroll down menu

    public void scrollDownMenuTest() {
        homePage.clickScrollDownMenu();
        sleepFor(1);
        if(driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[34]/li[1]/div")).getText().indexOf("SHOP BY CATEGORY")!=-1){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        } else {
            System.out.println("Failed");
            getScreenshot(driver);
        }
    }
    //

}


