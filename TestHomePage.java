import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    public HomePage homepage;

    @BeforeMethod
    public void init() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }


    public void signInTestCase() {
        homepage.signInClick();
        sleepFor(4);
    }

    public void getStartedTestCase(){
        homepage.getStartedClick();
        sleepFor(4);
    }

    public void productTestCase(){
        homepage.productsClick();
        sleepFor(4);
    }

    public void pricesTestCase(){
        homepage.pricesClick();
        sleepFor(4);
    }
    @Test
    public void emailTestCase(){
        homepage.emailInput("john@gmail.com");
        sleepFor(4);

    }

    public void commerceTestCase(){
        homepage.commerceClick();
        sleepFor(4);
    }

    public void custodyTestCase(){
        homepage.custodyClick();
        sleepFor(4);
    }

    public void earnTestCase(){
        homepage.earnClick();
        sleepFor(4);
    }

    public void proTestCase(){
        homepage.pricesClick();
        sleepFor(4);
    }

    public void USDcoinTestCase(){
        homepage.USDcoinClick();
        sleepFor(4);
    }

    public void walletTestCase(){
        homepage.walletClick();
        sleepFor(4);
    }

    public void buyBitcoinTestCase(){
        homepage.buyBitcoinClick();
        sleepFor(4);
    }

    public void buyBitcoinCashTestCase(){
        homepage.buyBitcoinCashClick();
        sleepFor(4);
    }

    public void buyEthereumTestCase(){
        homepage.buyEthereumClick();
        sleepFor(4);
    }

    public void buyLitecoinTestCase(){
        homepage.buyEthereumClick();
        sleepFor(4);
    }

    public void buyXRPTestCase(){
        homepage.buyXRPClick();
        sleepFor(4);
    }

    public void supportedCountriesTestCase(){
        homepage.supportedCountriesClick();
        sleepFor(4);
    }

    public void statusTestCase(){
        homepage.statusClick();
        sleepFor(4);
    }

    public void taxesTestCase(){
        homepage.taxesClick();
        sleepFor(4);
    }

    public void aboutTestCase(){
        homepage.aboutClick();
        sleepFor(4);
    }

    public void affiliatesTestCase(){
        homepage.affiliatesClick();
        sleepFor(4);
    }

    public void careersTestCase(){
        homepage.careersClick();
        sleepFor(4);
    }

    public void pressTestCase(){
        homepage.pressClick();
        sleepFor(4);
    }

    public void openSourceTestCase(){
        homepage.openSourceClick();
        sleepFor(4);
    }

    public void blogTestCase(){
        homepage.blogClick();
        sleepFor(4);
    }




}










