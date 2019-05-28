package regression;

import base.base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPrime extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"nav-link-prime\"]/span[2]")
    WebElement amazonPrime;
    @FindBy(xpath = "//*[@id=\"see-more-plans-text\"]/span/div")
    WebElement primePlans;

    public void clickAmazonPrime() {
        amazonPrime.click();
    }

    public void clickPrimePlans() {
        primePlans.click();
    }
}
