package regression;


import base.base.CommonAPI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CareersAmazon extends CommonAPI {
    @FindBy(css = "#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(1) > ul > li.nav_first > a")
    public static WebElement careers;
    @FindBy(css = "#teams > div.card-body.d-sm-inline-block > h3")
    public static WebElement teamsNavButton;
    @FindBy(css = "#main-content > div.a2d1-navigation > div > div > nav > div.nav-logo.float-left > a.menu.js-toggle-right-navbar-slider.float-left.d-flex.ml-md-auto > div")
    public static WebElement  amazonJobsDropDown;
    @FindBy(css = "#nav-item-locations > div > a")
    public static WebElement amazonJobsLocations;


    public void clickCareers() {
        careers.click();

    }

    public void clickTeamsNavButton() {
        teamsNavButton.click();

    }

    public void clickAmazonJobsDropDown() {
        amazonJobsDropDown.click();
    }

    public void clickAmazonJobsLocations() {
       amazonJobsLocations.click();
    }


}
