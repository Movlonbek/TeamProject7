import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {



    //-----------Storing all the WebElements of the Homepage for the test----------


    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/ul/li[3]/a/span")
    public static WebElement acccount;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/a[2]")
    public static WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"formstart\"]/button")
    public static WebElement watchForFreeButton;
    @FindBy(xpath = "//*[@id=\"this-is-netflix\"]/div[2]/div[2]/div[2]/div/div[3]/span[1]")
    public static WebElement watchAnywhereButton;
    @FindBy(xpath = "//*[@id=\"this-is-netflix\"]/div[2]/div[2]/div[3]/div/div[3]/span[1]")
    public static WebElement pickYourPrice;
    @FindBy (xpath = "/html/body/div[1]/div/div[3]/div[2]/ul/li[14]/a/span")
    public static WebElement contactUs;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/ul/li[2]/a/span")
    public static WebElement helpCenter;
    @FindBy(xpath = "//*[@id=\"undefined-select\"]")
    public static WebElement languagePicker;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/ul/li[1]")
    public static WebElement faq;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/ul/li[6]/a/span")
    public static WebElement jobs;
    @FindBy(xpath = "//*[@id=\"id_userLoginId\"]")
    public  static WebElement emailOrPhone;
    @FindBy(xpath = "//*[@id=\"id_password\"]")
    public  static WebElement signInPassword;
    @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")
    public  static WebElement signInFormSignInButton;



    //-----------Initializing all the click methods for all the WebElements----------



    public void clickAccount(){
        acccount.click();
    }
    public void clicksignInButton(){
        signInButton.click();
    }
    public void clickWatchForFreeButton(){
        watchForFreeButton.click();
    }
    public void clickWatchAnywhereButton(){
        watchAnywhereButton.click();
    }
    public void clickPickYourPrice(){
        pickYourPrice.click();
    }
    public void clickContactUs(){
        contactUs.click();
    }
    public void clickHelpCenter(){
        helpCenter.click();
    }
    public void clickLanguagePicker(){
        languagePicker.click();
    }
    public void clickFAQ(){ faq.click(); }
    public void clickJobs(){
        jobs.click();
    }

    //-----------Login method----------

    public void logIn(String email, String password){
        emailOrPhone.sendKeys(email);
        signInPassword.sendKeys(password);
        signInFormSignInButton.click();
    }

    public  WebElement getEmailOrPhone(){
        return emailOrPhone;
    }
    public WebElement getSignInPassword(){
        return signInPassword;
    }


}
