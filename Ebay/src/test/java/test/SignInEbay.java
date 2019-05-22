package test;

import base.base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInEbay extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"userid\"]")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"DS6-MAIN-CONTENT\"]/div[2]/div[1]/div[2]/div")
    WebElement pass;
    @FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
    WebElement signinHomepagebutton;
    @FindBy(xpath = "//*[@id=\"sgnBt\"]")
    WebElement signinPagebutton;

    public void gotosignInPage() {
        driver.navigate().to("https://ebay.com");
        signinHomepagebutton.click();
    }

    public void signIn(String username, String password)
    {
        email.sendKeys(username);
        pass.sendKeys(password);
        sleepFor(5);
        signinPagebutton.click();
}

}




