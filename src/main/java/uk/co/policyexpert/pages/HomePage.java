package uk.co.policyexpert.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.policyexpert.Utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//creation of log method

    public HomePage() {
        PageFactory.initElements(driver, this);//call page factory class

    }

    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//a[contains(@class,'body-copy mr-space1 text-black font-semibold')][normalize-space()='Help centre']")//locator , with FindBy- find element from web
    WebElement helpCentre;//object name

    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//input[@id='query']")//locator , with FindBy- find element from web
    WebElement searchBar;//object name

    @CacheLookup//to store element and memory to run test quicker
    @FindBy(id ="query")//locator , with FindBy- find element from web
    WebElement searchText;//object name


    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//input[@name='commit']")//locator , with FindBy- find element from web
    WebElement searchBtn;//object name

    @CacheLookup//to store element and memory to run test quicker
    @FindBy(xpath = "//p[contains(text(),'home insurance')]")//locator , with FindBy- find element from web
    WebElement verifyResults;//object name

    public void clickOnHelpCentreLink() {//method creation - this method click on HelpCentre
        clickOnElement(helpCentre);
        log.info("Clicking on HelpCentre : " + helpCentre);

    }

    public void clickOnSearchBar() {//method creation - this method mouse hoover and click on SearchBar
        mouseHoverAndClickOnElement(searchBar);
        log.info("MouseHoverAndClick on SearchBar: " + searchBar);
    }
    public void enterText(String text) {
        sendTextToElement(searchText, text);
}
    public void clickOnSearchBtn() {//method creation - this method click on HelpCentre
        clickOnElement(searchBtn);
        log.info("Clicking on SearchBtn : " + searchBtn);
}
    public String getVerifyResults() {// this method creation of verifying text
        String message = getTextFromElement(verifyResults);
        log.info("Getting text from : " + verifyResults.toString());
        return message;
    }
}