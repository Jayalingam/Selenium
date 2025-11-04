package seleniumStuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		// Step 1: Launch Chrome via BaseClass
        BaseClass.openChromeBrowser();
             
        // Step 2: Maximize window
        BaseClass.maxWindow();

        // Step 3: Open URL
        BaseClass.launchUrl("https://letcode.in/frame");
        
        
        WebElement myFrame =  BaseClass.driver.findElement(By.xpath("//iframe[@id='firstFr']"));
        driver.switchTo().frame(myFrame);

        BaseClass.applyImplicitWait(10);
        // Step 4: Perform login
        BaseClass.driver.findElement(By.xpath("//input[@name='fname']"))
                        .sendKeys("Jayalingam");

//        BaseClass.driver.findElement(By.xpath("//input[@placeholder='Enter Password']"))
//                        .sendKeys("83r5^_");
//
//        BaseClass.driver.findElement(By.xpath("//button[@class='button is-primary']")).click();
//        
//        BaseClass.applyImplicitWait(10);
//        
//        BaseClass.takeScreenShot("Four");
//
//        // Step 5: Close browser
//        BaseClass.closeBrowser();

	}

}
