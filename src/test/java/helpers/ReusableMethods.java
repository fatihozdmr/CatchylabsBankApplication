package helpers;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;

public class ReusableMethods extends BaseTest {
    private Logger log = LoggerFactory.getLogger(getClass());

    public static void waitElement(By element) {
        WebDriverWait waitElement = new WebDriverWait(driver, Duration.ofSeconds(15));
        waitElement.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }

    protected WebElement findElement(By element) {
        waitElement(element);
        return driver.findElement(element);

    }

    protected List<WebElement> findElements(By element) {
        waitElement(element);
        return driver.findElements(element);
    }
    protected void clickElement(By element) {
        findElement(element).click();
    }

    protected boolean isDisplayedBy(By element) {
        try {
            return findElement(element).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected void sendKeys(By element, String text) {
        findElement(element).sendKeys(text);
    }

    protected boolean isElementDisplayed(By element) {
        return findElement(element).isDisplayed();

    }
    protected String getText(By element) {
        return findElement(element).getText();
    }

    protected boolean checkText(By element, String expectedText) {
        waitElement(element);
        String text = getText(element);
        if (text.contains(expectedText)) {
            log.info("Element " + expectedText + " textini iceriyor");
            return true;
        } else {
            log.info("Element " + expectedText + " text degerini icermiyor!!!");
            return false;
        }
    }

    public void scrollToElement(By element) {
        waitElement(element);
        WebElement webElement = driver.findElement(element);
        new Actions(driver).scrollToElement(webElement).perform();
    }

    protected String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public void clear(By element) {
        findElement(element).clear();
    }
}
