package steps;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.MyAccountPage;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static pages.MyAccountPage.*;

public class MyAccountSteps extends BaseTest {

    MyAccountPage myAccountPage = new MyAccountPage();
    private Logger log = LoggerFactory.getLogger(getClass());


    @Step("Account name alaninin gorunur oldugunu kontrol et")
    public void isAccountNameDisplayed() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_AccountName), "Account name goruntulenemedi!!!");
        log.info("****** Account name texti goruntulendi ******");
    }

    @Step("Account type alaninin gorunur oldugunu kontrol et")
    public void isAccountTypeDisplayed() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_AccountType), "Account type goruntulenemedi!!!");
        log.info("****** Account type texti goruntulendi ******");
    }

    @Step("Creation time alanininin gorunur oldugunu kontrol")
    public void isCreationTimeDisplayed() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_CreationTime), "Creation time goruntulenemedi!!!");
        log.info("****** Creation time texti goruntulendi *******");
    }

    @Step("Amount alaninin gorunur oldugunu kontrol et")
    public void isAmountDisplayed() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_Amount), "Amount goruntulenemedi!!!");
        log.info("****** Amount texti goruntulendi ******");
    }

    @Step("Transactions alaninin gorunur oldugunu kontrol et")
    public void isTransactionsDisplayed() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_Transactions), "Transactions goruntulenemedi!!!");
        log.info("****** Transactions texti goruntulendi ******");
    }

    @Step("Edit account butonuna tikla")
    public void clickEditAccountButton() {
        myAccountPage.clickAccountElement(BTN_EditAccount);
        log.info("****** Edit Account butonuna tiklandi ******");
    }

    @Step("Edit account menusunun acildigini kontrol et")
    public void editAccount() {
        myAccountPage.checkEditAccountTxt();
        log.info("****** Edit account texti goruntulendi ******");
    }

    @Step("Account name textinin gorunur oldugunu kontrol et")
    public void checkAccountNameField() {
        myAccountPage.checkAccountNameField();
        log.info("******* Account name texti goruntulendi ********");
    }

    @Step("Account name alanina <name> textini gir ve ismi kaydet")
    public void enterAccountName(String name) {
        myAccountPage.editAccountNameAndSave(name);
        log.info("***** Account name alanina " + name + " texti girildi *****");
    }

    @Step("Update butonuna tikla")
    public void clickUpdateBtn() {
        myAccountPage.clickAccountElement(BTN_Update);
        log.info("***** Update butonuna tiklandi ******");
    }

    @Step("My account alaninin gorunur oldugunu kontrol et")
    public void isMyAccountDisplayed() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_MyAccount), "Account Name goruntulenemedi!!!");
        log.info("***** My account texti goruntulendi ******");
    }

    @Step("My account alanindaki Account name degerini kontrol et")
    public void checkEditedAccountName() {
        myAccountPage.checkAccountName();
        log.info("****** Account name basarili bir sekilde editlendi *******");
    }

    @Step("Transfer Money butonuna tikla")
    public void clickTransferMoneyBtn() {
        myAccountPage.clickAccountElement(BTN_TransferMoney);
        log.info("***** Transfer Money butonuna tiklandi *****");
    }

    @Step("Transfer money menusunun acildigini kontrol et")
    public void checkTransferMenuPopup() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_TransferMoney), "Transfer money menusu goruntulenemedi!!!");
        log.info("****** Transfer money texti goruntulendi ******");
    }

    @Step("Sender account textinin gorunur oldugunu kontrol et")
    public void checkTextSenderAccount() {
        myAccountPage.checkSenderAccountField();
        log.info("****** Sender account texti goruntulendi ******");
    }

    @Step("Sender account alaninin goruntulendigini kontrol et")
    public void isSenderAccountSelected() {
        assertTrue(myAccountPage.isAccountElementCheck(INPUT_SenderAccount), "Sender account alani goruntulenemedi!!!");
        log.info("****** Sender account alani goruntulendi ******");
    }

    @Step("Receiver account textinin gorunur oldugunu kontrol et")
    public void checkReceiverAccount() {
        myAccountPage.checkReceiverAccount();
        log.info("****** Receiver account texti goruntulendi ******");
    }

    @Step("Amount alanina <amount> gir ve tutari kaydet")
    public void enterAmount(String amount) {
        myAccountPage.sendAndSaveAmount(amount);
        log.info("****** Amount alanina " + amount + " tutari girildi ******");
    }

    @Step("Send butonuna tikla")
    public void clickSendButton() {
        myAccountPage.clickAccountElement(BTN_Send);
        log.info("****** Send butonuna tiklandi *******");
    }

    @Step("Transactions alanindaki Amount degerini transfer money icin kontrol et")
    public void saveAndCheckTransAmountTM() {
        myAccountPage.saveAndCheckTransAmountTM();
        log.info("******* Transactions alanindaki Amount degeri kontrol edildi *******");
    }

    @Step("Add Money butonuna tikla")
    public void clickAddMoneyBtn() {
        myAccountPage.clickAccountElement(BTN_AddMoney);
        log.info("****** Add Money butonuna tiklandi *******");
    }

    @Step("Add Money menusunun acildigini kontrol et")
    public void checkAddMoneyPopup() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_AddMoney), "Add money menusu goruntulenemedi!!!");
        log.info("******* Add Money popup'i goruntulendi *******");
    }

    @Step("Card number alaninin gorunur oldugunu kontrol et")
    public void checkCardNumberField() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_CardNumber), "Card number alani goruntulenemedi!!!");
        log.info("******* Card number alani goruntulendi *******");
    }

    @Step("Card holder alaninin gorunur oldugunu kontrol et")
    public void checkCardHolderField() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_CardHolder), "Card holder alani goruntulenemedi!!!");
        log.info("******** Card holder alani goruntulendi *******");
    }

    @Step("Expiry date alaninin gorunur oldugunu kontrol et")
    public void checkexpiryDateField() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_ExpiryDateTxt), "Expiry date alani goruntulenemedi!!!");
        log.info("****** Expiry date alani goruntulendi *******");
    }

    @Step("CVV alaninin gorunur oldugunu kontrol et")
    public void checkCVVDate() {
        assertTrue(myAccountPage.isAccountElementCheck(TXT_CVV), "CVV goruntulenemedi!!!");
        log.info("****** CVV texti goruntulendi ******");
    }

    @Step("Kart numarasi alanina <cardNumber> gir")
    public void enterCardNumber(String cardNumber) {
        myAccountPage.sendCardNumber(cardNumber);
        log.info("****** Kart numarasi alanina " + cardNumber + " numarasi girildi ******");
    }

    @Step("Card holder alanina <name> gir")
    public void enterCardHolder(String name) {
        myAccountPage.enterCardHolder(name);
        log.info("****** Card holder alanina " + name + " ismi girildi ******");
    }

    @Step("Expiry Date alanina <date> gir")
    public void enterExpiryDate(String date) {
        myAccountPage.enterExpiryDate(date);
        log.info("****** Expiry Date alanina " + date + " tarihi girildi ******");
    }

    @Step("CVV alanina <number> gir")
    public void enterCVV(String number) {
        myAccountPage.enterCVV(number);
        log.info("******* CVV alanina " + number + " numarasi girildi *******");
    }

    @Step("Amount alanina <amount> gir ve kaydet")
    public void enterAddAmount(String amount) {
        myAccountPage.sendAndSaveAddAmount(amount);
        log.info("****** Amount alanina " + amount + " tutari girildi ******");
    }

    @Step("Add butonuna tikla")
    public void clickAddBtn() {
        myAccountPage.clickAccountElement(BTN_CardSend);
        log.info("****** Add butonuna tiklandi ********");
    }

    @Step("Transactions listesinde Amount alanini kontrol et")
    public void saveAndCheckTransAddAmountTM() {
        myAccountPage.saveAndCheckAddAmount();
        log.info("****** Transactions alanindaki Amount degeri kontrol edildi *******");
    }
}
