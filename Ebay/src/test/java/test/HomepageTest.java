package test;

import base.base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class HomepageTest extends CommonAPI {

        HomePage homepage;
        SignInEbay ebay;


        @BeforeClass
        public void init() {
            homepage = PageFactory.initElements(driver, HomePage.class);
            ebay = PageFactory.initElements(driver, SignInEbay.class);
            driver.getCurrentUrl();
        }

        public void getback() {
            driver.getCurrentUrl();
        }


        //@Test

        public void clickMotors() {
            homepage.setMotors();

        }

        public void clickFashion() {
            homepage.Fashion();
        }


        public void clickSignInbutton(){
            homepage.setSignIn();
        }


        public void clickHomeandGardens(){
            homepage.HomeandGardens();

        }

        public void SearchBox(){

            homepage.SearchBox();
        }

        public void Save(){
            homepage.setSave();

        }


        public void clickSell(){
            homepage.setSave();

        }

        public void setDailyDeals(){
//            homepage.DailyDeals;

        }

        @Test (enabled = false)
        public void signInpage(){

        }

        public void Jewelry(){

            homepage.Jewelry();
        }

        public void Watches(){
            homepage.Watches();
        }


        public void setBeauty(){

            homepage.Beauty();
        }

        public void clickinMusicButton(){
            homepage.music();
        }


    public void dropdownTest()
        {
            homepage.dropdown();
        }
        @Test
        public  void signintest(){
            ebay.gotosignInPage();
            ebay.signIn("shakil","shakil");
        }


}
