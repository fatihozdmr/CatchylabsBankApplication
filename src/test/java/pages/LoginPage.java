package pages;

import helpers.ReusableMethods;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPage extends ReusableMethods {
    private Logger log = LoggerFactory.getLogger(getClass());

    public static By INPUT_Username = By.xpath("//input[@placeHolder='Username']");
    public static By INPUT_Password = By.xpath("//input[@placeHolder='Password']");
    public static By BTN_Login = By.xpath("//div[@tabindex='0']");
    public static By MSG_ErrorAlert = By.cssSelector(".r-howw7u");
    public static By BTN_Logout = By.cssSelector(".r-vw2c0b");
    public static By BTN_OpenMoneyTransfer = By.xpath("//div[@dir='auto' and contains(text(),'Open Money Transfer')]");
    public static By BTN_Back = By.cssSelector(".r-13hce6t");


    public void checkCurrentUrl(String url) {
        assertEquals(url, getPageUrl());
        log.info(url + " url'i " + getPageUrl() + " ile kontrol edildi.");
    }

    public boolean isUsernameInputDisplayed() {
        return isDisplayedBy(INPUT_Username);
    }
    public void sendUsername(String username){
        sendKeys(INPUT_Username, username);
        log.info(INPUT_Username + " alanina " + username + " degeri girildi");
    }
    public boolean isPasswordInputDisplayed() {
        return isDisplayedBy(INPUT_Password);
    }
    public void sendPassword(String password){
        sendKeys(INPUT_Password, password);
        log.info(INPUT_Password + " alanina " + password + " degeri girildi");
    }
    public void checkAndClickLoginButton() {
        isDisplayedBy(BTN_Login);
        clickElement(BTN_Login);
        log.info(BTN_Login + " elementi kontrol edildi ve tiklandi.");
    }

    public boolean isMoneyTransferDisplayed(){
        return isDisplayedBy(BTN_OpenMoneyTransfer);
    }

    public void clickBackButton() {
        isDisplayedBy(BTN_Back);
        clickElement(BTN_Back);
        log.info(BTN_Back + " elementi kontrol edildi ve tiklandi.");
    }

    public void clickLogoutButton() {
        isDisplayedBy(BTN_Logout);
        clickElement(BTN_Logout);
        log.info(BTN_Login + " elementi kontrol edildi ve tiklandi.");
    }

    public void checkAlertMessage(String text){
        checkText(MSG_ErrorAlert, text);
        log.info(MSG_ErrorAlert + " uyari mesaji kontrol edildi.");

    }

    public void clickMoneyTransferButton() {
        isDisplayedBy(BTN_OpenMoneyTransfer);
        clickElement(BTN_OpenMoneyTransfer);
        log.info(BTN_OpenMoneyTransfer + " elementi kontrol edildi ve tiklandi.");
    }



}
