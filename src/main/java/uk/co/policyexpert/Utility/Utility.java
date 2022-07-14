package uk.co.policyexpert.Utility;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.co.policyexpert.drivermanager.ManageDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utility extends ManageDriver {//Inheritance concept by extending mangerDriver


    public boolean verifyExpectedTextEqualsWithActual(WebElement element, String expectedText) {
        if (expectedText.equals(element.getText().trim())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyIfElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else
            return false;
    }

    /**
     * returns expected title text of the page
     */
    public String expectedTitleOfThePage(WebElement element) {
        waitUntilVisibilityOfElementLocated(element, 3);
        return element.getText();
    }

    /**
     * returns actual title text of the page
     */
    public String actualTitleOfThePage(String actualText) {
        return actualText;
    }


    // * This method will click on element
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    // * This method overloads click on element -- passing WebElement params
    public void clickOnElement(WebElement element) {
        element.click();
    }

    //  * This method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //  * This method will get text from element --> using WebElement
    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    //  * This method will send text on element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void sendTextToElement(WebElement element, String text) {
        element.sendKeys(text);
    }
    public void mouseHoverAndClickOnElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    // This Method to be Tested --> will wait until element is visible
    public void waitUntilVisibilityOfElementLocated(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    //************************** ScreenShot Methods *********************************************//


    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/test/java/resources/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }


}