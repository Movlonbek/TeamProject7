import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Jobs extends CommonAPI {

    //-------------Initializing all the WebElements of Jobs page--------------

    @FindBy(css = "#__next > div > header > section > div.css-njfcoy.e10x19ms8 > nav > a:nth-child(1) > span")
    public static WebElement teamsNavButton;
    @FindBy(css = "#__next > div > header > section > div.css-njfcoy.e10x19ms8 > nav > a:nth-child(2) > span")
    public static WebElement locNavButton;
    @FindBy(css = "#__next > div > header > section > div.css-njfcoy.e10x19ms8 > nav > span > a > span")
    public static WebElement lifeAtNetflixNavButton;
    @FindBy(css = "#__next > div > header > section > div.css-njfcoy.e10x19ms8 > a.css-z2rd9a.e10x19ms5")
    public static WebElement searchNavButton;
    @FindBy(css = "#autocomplete-input")
    public static WebElement searchBoxInput;


    //-------------List of click methods of all the WebElements of Jobs page--------------


    public void teamsNavButtonClick(){
        teamsNavButton.click();
    }
    public void locNavButtonClick(){
        locNavButton.click();
    }
    public void lifeAtNetflixNavButtonClick(){
        lifeAtNetflixNavButton.click();
    }
    public void searchNavButtonClick(){
        searchNavButton.click();
    }
    public void searchBoxInputSendKeys(String key){
        searchBoxInput.sendKeys(key);
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[1]/div[1]/div/div/button")).click();
    }
}
