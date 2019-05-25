import base.base.CommonAPI;
import org.testng.annotations.Test;

public class TestSpeed extends CommonAPI {
    @Test
    public void TestDropdown(){
        clickByXpath("/html/body/div[1]/div/div[3]/div[2]/ul/li[15]/a");
        sleepFor(2);
        clickByXpath("//*[@id=\"language-selector-btn\"]");
        sleepFor(2);
        clickByXpath("//*[@id=\"language-selector\"]/a[1]");
        sleepFor(2);
    }
}
