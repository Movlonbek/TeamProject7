package regression;

import base.base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpCenter extends CommonAPI {
    @FindBy(xpath = ("//*[@id=\"nav-hamburger-menu\"]/i"))
    WebElement dropDownMenu;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[34]/li[43]/a")
    WebElement help;

    public void clickDropDownMenu() {
        dropDownMenu.click();
    }

    public void clickHelp() {
        help.click();

    }
}
