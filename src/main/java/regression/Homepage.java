package regression;

import base.base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonAPI {

    //all web elements
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[2]")
    public static WebElement account;
    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
    public static WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    public  static WebElement emailOrNumber;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    public static WebElement signInPassword;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    public static WebElement signInfromSignInButton;
    @FindBy(xpath = "//*[@id=\"nav-orders\"]/span[2]")
    public static WebElement orders;
    @FindBy(xpath = "//*[@id=\"nav-link-prime\"]/span[2]")
    public static WebElement tryPrime;
    @FindBy(xpath = "//*[@id=\"nav-cart\"]/span[3]")
    public static WebElement cart;
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    WebElement dealsOfTheDay;
    @FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]/span[1]/span[2]/span")
    public static WebElement EN;
    @FindBy(xpath = "//*[@id=\"nav-logo\"]/a[1]/span[1]")
    public static WebElement amazonLogo;
    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]/i")
    public static WebElement scrollDownMenu;

    //all click method
    public void clickAccount() {
        account.click();
    }
    public void clickOrders() {

            orders.click();
    }

    public void clickTryPrime() {

            tryPrime.click();
    }

    public void clickCart() {
            cart.click();

    }

        public void clearSearchBox() {
            searchBox.clear();

    }

    public void ClickShopDealsOfTheDay() {
            dealsOfTheDay.click();

    }
    public void clickLanguageSetting() {
            EN.click();

    }
    public void clickAmazonLogo() {
            amazonLogo.click();
    }
    public void clickScrollDownMenu() {
            scrollDownMenu.click();
    }


    //signIn method

    public void signIn(String email, String password) {
            emailOrNumber.sendKeys(email);
            signInPassword.sendKeys(password);
            signInfromSignInButton.click();

    }
    public WebElement getEmailOrNumber(){

            return emailOrNumber;
    }
    public WebElement getSignInPasswordT(){

            return signInPassword;
    }
    public void signInButton() {
            signInfromSignInButton.click();

    }


    public void clickSignInButton() {
            signInButton.click();
    }
}