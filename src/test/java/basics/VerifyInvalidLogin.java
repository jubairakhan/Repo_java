package basics;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyInvalidLogin extends DriverWrapper{

    @Test
    public void verifyInvalidLogin() throws InterruptedException {

        //enter username
        getDriver().findElement(By.id("email")).sendKeys("mohammad@technosoft.com");

        //enter password
        getDriver().findElement(By.id("pass")).sendKeys("test1234");

        //Click on login button
        getDriver().findElement(By.id("loginbutton")).click();
        Thread.sleep(2000);

        //Verify Error message
        String expectedErrorMessage = getDriver().findElement(By.linkText("Recover Your Account")).getText();
        Assert.assertEquals("Recover Your Account", expectedErrorMessage);
    }
}
