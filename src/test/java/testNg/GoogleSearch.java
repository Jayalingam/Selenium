package testNg;

import org.testng.annotations.Test;

import commonSteps.BaseClass;

public class GoogleSearch {
	
	@Test
	public void googleSearch() {
		// Step 1: Launch Chrome via BaseClass
        BaseClass.openChromeBrowser();
            
        // Step 2: Maximize window
        BaseClass.maxWindow();

        // Step 3: Open URL
        BaseClass.launchUrl("https://www.google.com/");

	}

}
