import base.base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class TestWaysToWatch extends CommonAPI {
    public WaysToWatch waysToWatch;

    @BeforeMethod

    public void init(){
        waysToWatch = PageFactory.initElements(driver, WaysToWatch.class);
    }

    //--------------Test case 1. Printing out all Stream Media Players --------------------------


    public void testAllStreamMediaPlayers(){
        List<WebElement> list = new ArrayList<WebElement>();
        waysToWatch.streamMediaClick();
        list = getListOfWebElementsByXpath("/html/body/section[2]/div/div[25]");
        sleepFor(1);
        TestLogger.log(getClass().getSimpleName() + " The List of Stream Media Players you can watch Netflix on: " + getListOfString(list));

    }

    //--------------Test case 2. Printing out all SmartTV devices Netflix is available on --------------------------


    public void testAllSmartTV(){
        List<WebElement> list = new ArrayList<WebElement>();
        waysToWatch.smartTVClick();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)", "");
        list = getListOfWebElementsByXpath("/html/body/section[3]/div/div[37]");
        sleepFor(2);

        TestLogger.log(getClass().getSimpleName() + " The List of SmartTV channels you can watch Netflix on: " + waysToWatch.stringOfElements(getListOfString(list)));
        sleepFor(1);
    }

    //--------------Test case 3. Printing out all Game consoles Netflix is available on --------------------------

    @Test

    public void testAllGameConsoles(){
        waysToWatch.gameConsolesClick();
        List<WebElement> list = new ArrayList<WebElement>();
        list = getListOfWebElementsByXpath("/html/body/section[4]/div/div[37]");
        sleepFor(2);
        TestLogger.log(getClass().getSimpleName() + " The List of SmartTV channels you can watch Netflix on: " + waysToWatch.stringOfElements(getListOfString(list)));
        sleepFor(1);
    }

    //--------------Test case 4. Printing out all SetUp Boxes Netflix is available on --------------------------

    public void testAllSetUpBoxes() {
        waysToWatch.setUpBoxesClick();
        List<WebElement> list = new ArrayList<WebElement>();
        list = getListOfWebElementsByXpath("/html/body/section[5]/div/div[17]");
        sleepFor(2);
        TestLogger.log(getClass().getSimpleName() + " The List of Setup boxes you can watch Netflix on: " + waysToWatch.stringOfElements(getListOfString(list)));
        sleepFor(1);
    }

    //--------------Test case 5. Printing out all BluRay Devices Netflix is available on --------------------------

    public void testAllBluRay() {
        waysToWatch.blurayClick();
        List<WebElement> list = new ArrayList<WebElement>();
        list = getListOfWebElementsByXpath("/html/body/section[6]/div/div[37]");
        sleepFor(2);
        TestLogger.log(getClass().getSimpleName() + " The List of BluRay devices you can watch Netflix on: " + waysToWatch.stringOfElements(getListOfString(list)));
        sleepFor(1);
    }

    //--------------Test case 6. Printing out all SmartPhones  Netflix is available on --------------------------

    public void testAllSmartPhones() {
        waysToWatch.smartPhonesClick();
        List<WebElement> list = new ArrayList<WebElement>();
        list = getListOfWebElementsByXpath("/html/body/section[7]/div/div[37]");
        sleepFor(2);
        TestLogger.log(getClass().getSimpleName() + " The List of SmartPhone devices you can watch Netflix on: " + waysToWatch.stringOfElements(getListOfString(list)));
        sleepFor(1);
    }

    //--------------Test case 7. Printing out all PCs  Netflix is available on --------------------------

    public void testAllPCs() {
        waysToWatch.pcsClick();
        sleepFor(1);
        TestLogger.log(getClass().getSimpleName() + " The List of PC devices you can watch Netflix on: " + getTextFromWebElements("/html/body/section[8]/div/div[1]/div"));

    }
}
