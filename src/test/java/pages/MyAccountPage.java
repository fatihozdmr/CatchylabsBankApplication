package pages;

import helpers.ReusableMethods;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DecimalFormat;

public class MyAccountPage extends ReusableMethods {

    public static By TXT_MyAccount = By.xpath("//div[.='My account']");
    public static By TXT_AccountName = By.xpath("//div[.='Account name']");
    public static By TXT_AccountType = By.xpath("//div[.='Account type']");
    public static By TXT_CreationTime = By.xpath("//div[.='Creation time']");
    public static By TXT_Amount = By.xpath("//div[@class='css-146c3p1 r-1ozpqpt r-g6644c r-1b43r93 r-vw2c0b r-1j6l8hp' and contains(text(),'Amount')]");
    public static By TXT_Transactions = By.xpath("//div[.='Transactions']");
    public static By BTN_EditAccount = By.xpath("(//div[@class='css-146c3p1 r-jwli3a r-1b43r93'])[4]");
    public static By TXT_EditAccount = By.xpath("//div[@class='css-146c3p1 r-ubezar r-vw2c0b']");
    public static By INPUT_AccountName = By.cssSelector("[placeholder]");
    public static By BTN_Update = By.xpath("//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13qz1uu']");
    public static By TXT_AccountNameAI = By.xpath("(//div[@class='css-146c3p1 r-1ozpqpt r-yv33h5 r-1b43r93'])[1]");
    public static By BTN_TransferMoney = By.xpath("(//div[@class='css-146c3p1 r-jwli3a r-1b43r93'])[2]");
    public static By TXT_TransferMoney = By.xpath("//div[@class='css-146c3p1 r-ubezar r-vw2c0b']");
    public static By TXT_SenderAccount = By.xpath("//div[.='Sender account']");
    public static By TXT_ReceiverAccount = By.xpath("//div[.='Receiver account']");
    public static By INPUT_SenderAccount = By.xpath("//div[@class='css-175oi2r r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-agouwx r-1pi2tsx r-13qz1uu']//div[3]/select[1]");
    public static By INPUT_Amount = By.cssSelector("[placeholder]");
    public static By BTN_Send = By.xpath("//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13qz1uu']/div[@class='css-146c3p1 r-jwli3a r-1b43r93']");
    public static By BTN_AddMoney = By.xpath("(//div[@class='css-146c3p1 r-jwli3a r-1b43r93'])[3]");
    public static By TXT_AddMoney = By.xpath("(//div[@dir='auto' and contains (text(),'Add money')])[1]");
    public static By TXT_CardNumber = By.xpath("//div[@dir='auto' and contains (text(),'Card number')]");
    public static By INPUT_CardNumber = By.xpath("//div/div[2]/input");
    public static By INPUT_CardHolder = By.xpath("//div/div[4]/input");
    public static By INPUT_ExpiryDate = By.xpath("(//div/div[1]/input) [1]  ");
    public static By INPUT_CVV = By.xpath("(//div/div[1]/input) [2]  ");
    public static By INPUT_AddAmount = By.xpath("//div/div[8]/input");
    public static By BTN_CardSend = By.xpath("//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13qz1uu']/div[@class='css-146c3p1 r-jwli3a r-1b43r93']");
    public static By TXT_CardHolder = By.xpath("//div[@dir='auto' and contains (text(),'Card holder')]");
    public static By TXT_ExpiryDateTxt = By.xpath("//div[@dir='auto' and contains (text(),'Expiry date')]");
    public static By TXT_CVV = By.xpath("//div[@dir='auto' and contains (text(),'CVV')]");
    public static By TXT_TransactionAmount = By.xpath("(//div[@class='css-146c3p1 r-1ozpqpt r-yv33h5 r-1b43r93'])[5]");

    private Logger log = LoggerFactory.getLogger(getClass());

    String accountName;
    int enteredAmount;
    int enteredAddAmount;


    protected boolean isAccountElementDisplayed(By element) {
        return isDisplayedBy(element);
    }

    public boolean isAccountElementCheck(By element) {
        try {
            if (!isAccountElementDisplayed(element)) {
                log.info("Error: Element gorunur degil.!!!");
            }
            if (!checkText(element, getText(element))) {
                log.info("Error: Element belirtilen metni icermiyor.!!!");
            }
            log.info("Element hem gorunur hem de belirtilen metni iceriyor.");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void clickAccountElement(By element) {
        clickElement(element);
        log.info(element + " elementi kontrol edildi ve tiklandi.");
    }

    public void checkEditAccountTxt() {
        checkText(TXT_EditAccount, "Edit account");
        log.info(TXT_EditAccount + " texti kontrol edildi.");
    }

    public void checkAccountNameField() {
        checkText(TXT_EditAccount, "Edit account");
        log.info(TXT_EditAccount + " alanindaki text kontrol edildi.");
    }

    public void editAccountNameAndSave(String name) {
        clear(INPUT_AccountName);
        sendKeys(INPUT_AccountName, name);
        accountName = name;
        log.info(INPUT_AccountName + " alanina " + name + " texti girildi ve kaydedildi.");
    }

    public void checkAccountName() {
        String editedAccountName = getText(TXT_AccountNameAI);
        Assertions.assertEquals(accountName, editedAccountName);
    }

    public void checkSenderAccountField() {
        checkText(TXT_SenderAccount, "Sender account");
        log.info(TXT_SenderAccount + " alanindaki text kontrol edildi.");
    }

    public void checkReceiverAccount() {
        checkText(TXT_ReceiverAccount, "Receiver account");
    }

    public void sendAndSaveAmount(String amount) {
        sendKeys(INPUT_Amount, amount);
        enteredAmount = Integer.parseInt(amount);
        log.info(INPUT_Amount + " alanina " + amount + " degeri girildi.");
    }

    public void saveAndCheckTransAmountTM() {
        int totalAmountWithCommission = enteredAmount;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String totalAmountWithCommissionStr = decimalFormat.format(totalAmountWithCommission);
        String transactionText = getText(TXT_TransactionAmount);
        totalAmountWithCommissionStr = totalAmountWithCommissionStr.replace(',', '.');
        log.info("Transaction alaninda goruntulenmesi gereken tutar: " + enteredAmount + " goruntulenen tutar: " + transactionText);
        Assertions.assertEquals(totalAmountWithCommissionStr, transactionText);
    }

    public void sendCardNumber(String cardNumber) {
        sendKeys(INPUT_CardNumber, cardNumber);
    }

    public void enterCardHolder(String name) {
        sendKeys(INPUT_CardHolder, name);
    }

    public void enterExpiryDate(String date) {
        sendKeys(INPUT_ExpiryDate, date);
    }

    public void enterCVV(String number) {
        sendKeys(INPUT_CVV, number);
    }

    public void sendAndSaveAddAmount(String amount) {
        sendKeys(INPUT_AddAmount, amount);
        enteredAddAmount = Integer.parseInt(amount);
        log.info(INPUT_AddAmount + " alanina " + enteredAddAmount + "degeri girildi.");
    }

    public void saveAndCheckAddAmount() {
        int accountAmount = enteredAddAmount;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String totalAmount = decimalFormat.format(accountAmount);
        String transactionText = getText(TXT_TransactionAmount);
        totalAmount = totalAmount.replace(',', '.');
        Assertions.assertEquals(totalAmount, transactionText);
        log.info("Transaction alanindaki tutar: " + transactionText + ", Gosterilen tutar: " + totalAmount);
    }


}
