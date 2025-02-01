package base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {

    private Logger log = LoggerFactory.getLogger(getClass());
    protected static WebDriver driver = null;

    @BeforeScenario
    public void setupDriver() {
        String browser = System.getProperty("browser", "chrome").toLowerCase();

        if (browser == null || browser.isEmpty()) {
            browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-notifications");
                chromeOptions.addArguments("--disable-application-cache");
                driver = new ChromeDriver(chromeOptions);
                driver.manage().deleteAllCookies();
                log.info("Tarayici olarak " + browser + " baslatildi...");
                break;


            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--disable-notifications");
                edgeOptions.addArguments("--disable-application-cache");
                driver = new EdgeDriver(edgeOptions);
                driver.manage().deleteAllCookies();
                log.info("Tarayici olarak " + browser + " baslatildi...");
                break;

            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--disable-notifications");
                firefoxOptions.addArguments("--disable-application-cache");
                driver = new FirefoxDriver(firefoxOptions);
                driver.manage().deleteAllCookies();
                log.info("Tarayici olarak " + browser + " baslatildi...");
                break;

            default:
                ChromeOptions defaultOptions = new ChromeOptions();
                defaultOptions.addArguments("--disable-notifications");
                defaultOptions.addArguments("--disable-application-cache");
                driver = new ChromeDriver(defaultOptions);
                driver.manage().deleteAllCookies();
                log.info("Tarayici olarak " + browser + " baslatildi...");
                break;
        }
        driver.manage().window().maximize();

    }

    @AfterScenario
    public void tearDown() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
            log.info("TEST TAMAMLANDI!");
        }
    }
}
