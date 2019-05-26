import base.base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MediaCenter extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"mainNavigation\"]/div[2]/ul[2]/li[1]/a")
    public WebElement onlyOnNetflix;
    @FindBy(xpath = "//*[@id=\"mainNavigation\"]/div[2]/ul[2]/li[2]/a")
    public WebElement releasesAndBlogs;
    @FindBy(xpath = "//*[@id=\"mainNavigation\"]/div[2]/ul[2]/li[3]/a")
    public WebElement companyAssets;
    @FindBy(xpath = "//*[@id=\"mainNavigation\"]/div[2]/ul[2]/li[4]/a")
    public WebElement aboutNetflix;
    @FindBy(xpath = "//*[@id=\"toggleLanguageSelection\"]")
    public WebElement languagePicker;
    @FindBy(xpath = "//*[@id=\"mainNavigation\"]/div[2]/ul[1]/li[2]/a")
    public WebElement mediaLogIn;
    @FindBy(xpath = "//*[@id=\"mainNavigation\"]/div[2]/ul[1]/li[3]/a")
    public WebElement register;




    public void onlyOnNetflixClick(){
        onlyOnNetflix.click();
        sleepFor(2);
    }
    public void releasesAndBlogsClick(){
        releasesAndBlogs.click();
        sleepFor(2);
    }
    public void companyAssetsClick(){
        companyAssets.click();
        sleepFor(2);
    }
    public void aboutNetflixClick(){
        aboutNetflix.click();
        sleepFor(2);
    }
    public void languagePickerClick(){
        languagePicker.click();
        sleepFor(2);
    }
    public void mediaLogInClick(){
        mediaLogIn.click();
        sleepFor(2);
    }
    public void registerClick(){
        register.click();
        sleepFor(2);
    }
    public  Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        InputStream inputST = new FileInputStream("C:\\Users\\wormi\\IdeaProjects\\TeamProject7\\Netflix\\src\\test\\resources\\mail.properties");
        prop.load(inputST);
        inputST.close();
        return prop;

    }


}
