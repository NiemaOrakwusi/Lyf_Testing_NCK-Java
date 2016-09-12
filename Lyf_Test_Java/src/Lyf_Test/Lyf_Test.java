/*Selenium and JUnit Test high-level to verify clicks within two pages
 *  within Lyf.ng are working. By: Niema Kitt*/
package Lyf_Test;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Lyf_Test {
		//Initialize the WebDriver
		private static WebDriver drv;
		
		//Start BeforeClass to provide startup of the application
		@BeforeClass
		public static void start(){
			
						
			
		}//end start 
		//Start of First Test
		@Test
		public void Movies() {
			
			//Set JSon GEO-location to true and share
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("geo.prompt.testing", true);
			profile.setPreference("geo.prompt.testing.allow", true);
			profile.setPreference("geo.wifi.uri", "file://D:/geoLocation.json");
			drv = new FirefoxDriver(profile);
			
			//Open URL being tested
			drv.get("http://www.lyf.ng");
			
			//Put a pause or wait for 60 second
			drv.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
			
			//Find the Element from the link and click
			drv.findElement(By.linkText("Movies")).click();

			
		}//end of Movie
		//Start of Second Test
		@Test
		public void Air_Bill() {
					
			//Set JSon GEO-location to true and share
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("geo.prompt.testing", true);
			profile.setPreference("geo.prompt.testing.allow", true);
			profile.setPreference("geo.wifi.uri", "file://D:/geoLocation.json");
			drv = new FirefoxDriver(profile);
			
			//Open URL being tested
			drv.get("http://www.lyf.ng");
			
			
			//Put a pause or wait for 60 second
			drv.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
			
			//Find the Element from the link and click
			drv.findElement(By.linkText("Bills & Airtime")).click();
			

		}//end of Air_Bill
		//Start of Cleanup
		@AfterClass
		public static void CleanUp(){

		//Print Displayed of the results of the test.
		System.out.println("Test Successful");
		
		//Close all
		drv.quit();
	}

}
