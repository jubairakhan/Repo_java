package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {

    private static WebDriver driver = null;
    private static String url = "https://www.facebook.com";

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
