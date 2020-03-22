package com.edureka.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWebElements {

	public static WebDriver driver=null;
	public static WebDriverWait wait = null;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Edureka_March_Weekend_2020\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.sendKeys("William");
		
		WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lname.sendKeys("Smith");
		
		WebElement maleRadio = driver.findElement(By.xpath("//input[@value='Male']"));
		maleRadio.click();
		
		WebElement chk_cricket = driver.findElement(By.id("checkbox1"));
		chk_cricket.click();
		
		WebElement chk_movies = driver.findElement(By.xpath("//input[@value='Movies']"));
		chk_movies.click();
		
		
	 WebElement languages =driver.findElement(By.xpath("//div[@id='msdd']"));
			 languages.click();
		WebElement danish = driver.findElement(By.xpath("//a[contains(text(),'Danish')]"));
		danish.click();
		 languages.clear();
		 driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		
		
		WebElement countryListBox = driver.findElement(By.id("countries"));
		Select osel = new Select(countryListBox);
		
		//osel.selectByIndex(5);
		//osel.selectByValue("Germany");
		osel.selectByVisibleText("India");
		
	driver.findElement(By.id("firstpassword")).sendKeys("your_password");	

		
		WebElement submitBtn = driver.findElement(By.id("submitbtn"));
		submitBtn.click();

	}

}
