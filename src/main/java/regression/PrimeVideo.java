package regression;

import base.base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrimeVideo extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]")
    WebElement scrollDownMenu;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[34]/li[2]/a")
    WebElement primeVideo;

    public void clickScrollDownMenu() {
        scrollDownMenu.click();
    }

    public void clickPrimeVideo() {
        primeVideo.click();

    }


}
