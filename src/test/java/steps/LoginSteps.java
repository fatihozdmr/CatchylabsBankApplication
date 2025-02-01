package steps;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.*;

public class LoginSteps extends BaseTest {

    protected LoginPage loginPage = new LoginPage();
    private Logger log = LoggerFactory.getLogger(getClass());


    @Step("<url> adresine git")
    public void navigateToUrl(String url) {
        driver.get(url);
        log.info(url + " url'ine gidiliyor...");

    }

    @Step("url'i <url> ile kontrol et")
    public void checkCurrentUrl(String url) {
        loginPage.checkCurrentUrl(url);
    }

    @Step("Username alaninin gorunur oldugunu kontrol et")
    public void checkUsernameInputField() {
        assertTrue(loginPage.isUsernameInputDisplayed(), "Username alani goruntulenemedi!!!");
    }

    @Step("Password alaninin gorunur oldugunu kontrol et")
    public void checkPasswordInputField() {
        assertTrue(loginPage.isPasswordInputDisplayed(), "Password alani goruntulenemedi!!!");
    }

    @Step("<username> textini username alanina yaz")
    public void enterUsername(String username) {
        loginPage.sendUsername(username);
        log.info("****** Kullanici adi girildi. ******");
    }

    @Step("<password> textini password alanina yaz")
    public void enterPassword(String password) {
        loginPage.sendPassword(password);
        log.info("****** Kullanici sifresi girildi. ******");
    }

    @Step("Open Money Transfer butonunun gorunur oldugunu kontrol et")
    public void checkOpenTransferMoneyButton() {
        assertTrue(loginPage.isMoneyTransferDisplayed(), "Open Money Transfer butonu goruntulenemedi!!!");
    }

    @Step("Login butonuna tikla")
    public void clickToLoginButton() {
        loginPage.checkAndClickLoginButton();
        log.info("****** Login butonuna tiklandi. ******");
    }

    @Step("Back butonuna tikla")
    public void clickBackButton() {
        loginPage.clickBackButton();
        log.info("****** Back butonuna tiklandi. ******");
    }

    @Step("Logout butonuna tikla")
    public void clickLogoutButton() {
        loginPage.clickLogoutButton();
        log.info("****** Logout butonuna tiklandi. *******");
    }

    @Step("<text> uyari mesajini kontrol et")
    public void checkAlertMessageInvalidLogin(String text) {
        loginPage.checkAlertMessage(text);
    }

    @Step("<second> saniye bekle")
    public void waitBySecond(int second) throws InterruptedException {
        Thread.sleep(second * 1000);
    }

    @Step("Open Money Transfer butonuna tikla")
    public void clickOpenTransferMoneyButton() {
        loginPage.clickMoneyTransferButton();
        log.info("****** Open Money Transfer butonuna tiklandi. ******");

    }




}
