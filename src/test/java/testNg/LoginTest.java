package testNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import commonSteps.BaseClass;

public class LoginTest {
	
	@Test
    public void loginTest() throws Exception {

        // Step 1: Launch Chrome via BaseClass
        BaseClass.openChromeBrowser();
            
        // Step 2: Maximize window
        BaseClass.maxWindow();

        // Step 3: Open URL
        BaseClass.launchUrl("https://demoqa.com/login");
       
        // Step 4: Perform login
        String userName = BaseClass.readExcel("LoginDetails", "Sheet1", 1, 0);
        BaseClass.driver.findElement(By.xpath("//input[@id='userName']"))
                        .sendKeys(userName);
        String passWord = BaseClass.readExcel("LoginDetails", "Sheet1", 1, 1);
        BaseClass.driver.findElement(By.xpath("//input[@id='password']"))
                        .sendKeys(passWord);

        BaseClass.driver.findElement(By.xpath("//button[@id='login']")).click();
        
        BaseClass.applyImplicitWait(10);
        
        BaseClass.takeScreenShot("Six");

        // Step 5: Close browser
        BaseClass.closeBrowser();
    }
}
