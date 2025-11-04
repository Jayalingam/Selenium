package seleniumStuff;

import java.time.Duration;

import org.openqa.selenium.By;

public class LoginTest {

    public static void main(String[] args) throws Exception {

        // Step 1: Launch Chrome via BaseClass
        BaseClass.openChromeBrowser();
        
       
      
        // Step 2: Maximize window
        BaseClass.maxWindow();

        // Step 3: Open URL
        BaseClass.launchUrl("https://letcode.in/login");

        // Step 4: Perform login
        BaseClass.driver.findElement(By.xpath("//input[@placeholder='Enter Username']"))
                        .sendKeys("mor_2314");

        BaseClass.driver.findElement(By.xpath("//input[@placeholder='Enter Password']"))
                        .sendKeys("83r5^_");

        BaseClass.driver.findElement(By.xpath("//button[@class='button is-primary']")).click();
        
        BaseClass.applyImplicitWait(10);
        
        BaseClass.takeScreenShot("Four");

        // Step 5: Close browser
        BaseClass.closeBrowser();
    }
}
