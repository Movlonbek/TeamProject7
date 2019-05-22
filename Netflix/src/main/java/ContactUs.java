import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends CommonAPI {


    //-------------Initializing all the WebElements of Contact Us page--------------

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[1]/div[2]/a[1]")
    public static WebElement signInButtonContact;
    @FindBy(xpath = "//*[@id=\"search-input\"]")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"phoneContactTrigger\"]")
    public static WebElement callUsPhoneNumber;
    @FindBy(xpath = "//*[@id=\"startChatTrigger\"]")
    public static WebElement startLiveButton;
    @FindBy(xpath = "//*[@id=\"lang-switcher\"]")
    public static WebElement langSwitch;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/section[2]/p[3]/a")
    public static WebElement articleHelpful;


    //-------------List of click methods of all the WebElements of Contact Us page--------------


    public void signInButtonClick(){
        signInButtonContact.click();
    }
    public void searchBoxSendKeys(String key){
        searchBox.sendKeys(key);
        driver.findElement(By.xpath("//*[@id=\"search-placeholder\"]/form/div/div/div[1]/button")).click();
    }
    public void callUsClick(){
        callUsPhoneNumber.click();
    }
    public void startLiveChatClick(){
        startLiveButton.click();
    }
    public void langSwicthClick(){
        langSwitch.click();
    }
    public void articleClick(){
        articleHelpful.click();
    }

    public void closeModalWindow(){
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/button")).click();
    }

}
