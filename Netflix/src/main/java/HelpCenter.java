import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpCenter extends CommonAPI {

    //-------------Initializing all the WebElements of HelpCenter page--------------

    @FindBy(xpath = "//*[@id=\"search-input\"]")
    public static WebElement searchButtonHelp;
    @FindBy(xpath = "//*[@id=\"phoneContactTrigger\"]")
    public static WebElement callHelpButton;
    @FindBy(xpath = "//*[@id=\"startChatTrigger\"]")
    public static WebElement liveChatButton;
    @FindBy(xpath = "//*[@id=\"top-articles-placeholder\"]/div[3]/div/ol/li[1]/a")
    public static WebElement cantSignInHelp;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/section/div[2]/div/ol/li[1]/a")
    public static WebElement resetPasswordHelp;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/section/div[2]/div/ol/li[2]/a")
    public static WebElement updateemailHelp;
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/section/div[2]/div/ol/li[4]/a")
    public static WebElement updatePaymentMethod;


    //-------------List of click methods of all the WebElements of Help Center  page--------------

    public void closeModalWindowHelp(){
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/button")).click();
    }

    public void searchButtonHelpSendKeys(String keys){
        searchButtonHelp.sendKeys(keys);
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"search-placeholder\"]/form/div/div/div[1]/button")).click();
    }
    public void callHelpButtonClick(){
        callHelpButton.click();
    }
    public void liveChatButtonClick(){
        liveChatButton.click();
    }
    public void cantSignInHelpClick(){
        cantSignInHelp.click();
    }
    public void resetPasswordHelpClick(){
        resetPasswordHelp.click();
    }
    public void updateEmailHelp(){
        updateemailHelp.click();
    }
    public void updatePaymentMethodClick(){
        updatePaymentMethod.click();
    }
}
