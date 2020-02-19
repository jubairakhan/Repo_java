package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestScenario {


    @Test
    public void testSampleScenario() {
        //Set Chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        //Initialize webdriver
        WebDriver driver = new ChromeDriver();

        //Declare URL
        String url = "https://www.facebook.com/";

        //Navigate to the URL
        driver.navigate().to(url);

        //Get Current URL from browser
        String browserUrl = driver.getCurrentUrl();

        //Verify if URL is correct
        Assert.assertEquals(browserUrl,url);

        //Quit driver
        driver.quit();
    }
}
