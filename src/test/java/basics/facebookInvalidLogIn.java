package basics;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class facebookInvalidLogIn {
    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("jubairakhan@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("juby12");
        Thread.sleep(400);
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();


//        Alert alert= driver.switchTo().alert();
//        String text=(alert.getText());
//
//        if(text.equals("The password you’ve entered is incorrect. ")){
//            System.out.println("valid alert message");
//        }
//        else{
//            System.out.println("invalid message");
//        }

Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div")).click();

//driver.findElement(By.xpath("//*[@id=\'globalContainer\']/div[3]/div/div/div"));






    }
}
