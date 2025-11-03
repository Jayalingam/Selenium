package seleniumStuff;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\ajayalingam\\eclipse-workspace\\SeleniumLearning\\drivers\\chrome-win32\\chrome-win32\\chrome.exe");
		ChromeDriver driver = new ChromeDriver();

	}

}
