package homepage;

import base.base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")
    WebElement Motors;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    WebElement Fashion;
    @FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
    WebElement SignIn;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a")
    WebElement HomeandGardens;
    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    WebElement SearchBox;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[2]/a")
    WebElement Save;
    @FindBy(xpath = "//*[@id=\"gh-p-2\"]/a]")
    WebElement Sell;
    @FindBy(xpath = "//*[@id=\"items_list1\"]/div[1]/div/div[1]/h2/a")
    WebElement DailyDeals;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/div[2]/ul/li[1]/a")
    WebElement Jewelry;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/section[3]/div[2]/a[5]/div[2]")
    WebElement Watches;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/section[3]/div[2]")
    WebElement Beauty;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a")
    WebElement Music;
    @FindBy (xpath = "//*[@id=\"gh-cat\"]")
    WebElement dropdown;


    public void setMotors() {
        System.out.println(driver.getTitle());
        Motors.click();
    }

    public void Fashion() {
        Fashion.click();

    }

    public void setSignIn() {
        SignIn.click();

    }

    public void HomeandGardens() {
        HomeandGardens.click();
    }
        public void SearchBox () {
            SearchBox.click();
        }
        public void setSave () {
            Save.click();
        }
        public void setSell () {
            Sell.click();

        }
        public void setDailyDeals () {
            DailyDeals.click();
        }
        public void Jewelry () {
            Jewelry.click();
        }
        public void Watches () {
            Watches.click();
        }
        public void Beauty () {
            Beauty.click();
        }
        public void gotoMusic(){
            Music.click();

        }
        public void dropdown(){
            Select select = new Select(dropdown);
            dropdown.click();
            select.selectByIndex(3);

        }



    }


