package seleniumStuff;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "F:\\Jaga\\Selenium\\drivers\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

	}

}
