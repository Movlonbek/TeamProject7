import base.base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WaysToWatch extends CommonAPI {

    @FindBy(xpath = "/html/body/section[1]/ul/li[1]")
    public WebElement StreaMediaPlayers;
    @FindBy(className = "hdtvs-icon_active")
    public WebElement SmartTV;
    @FindBy(css= "body > section.shadowed.device-slider.device-count-7 > ul > li.game_consoles-icon > span")
    public WebElement GameConsoles;
    @FindBy(xpath = "/html/body/section[1]/ul/li[4]")
    public WebElement SetUpBoxes;
    @FindBy(xpath = "/html/body/section[1]/ul/li[5]")
    public WebElement BluRay;
    @FindBy(xpath = "/html/body/section[1]/ul/li[6]")
    public WebElement SmartPhones;
    @FindBy(xpath = "/html/body/section[1]/ul/li[7]")
    public WebElement Pcs;



    public void streamMediaClick(){StreaMediaPlayers.click();
    sleepFor(2);}
    public void smartTVClick(){SmartTV.click();
        sleepFor(2);}
    public void gameConsolesClick(){GameConsoles.click();
        sleepFor(2);}
    public void setUpBoxesClick(){SetUpBoxes.click();
        sleepFor(2);}
    public void blurayClick(){BluRay.click();
        sleepFor(2);}
    public void smartPhonesClick(){SmartPhones.click();
        sleepFor(2);}
    public void pcsClick(){Pcs.click();
        sleepFor(2);}

    public String stringOfElements(List<String> items){
        String bigString = "";
        for (String item : items){
            bigString = bigString + item +",";
        }
        return bigString;
    }



}
