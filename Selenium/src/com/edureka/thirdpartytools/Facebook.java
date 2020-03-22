package com.edureka.thirdpartytools;

/*import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

/*public class Facebook {
	
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	public static void main(String[] args) throws FindFailed 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		
		Screen screen = new Screen();
		Pattern email = new Pattern(".//ImagesForTesting//Email.PNG");
		Pattern pwd = new Pattern(".//ImagesForTesting//Password.PNG");
		Pattern login = new Pattern(".//ImagesForTesting//Login.PNG");
		
		screen.type(email,"your_email@something.com");
		screen.type(pwd, "your_password");
		screen.click(login);
		

	}

}
*/