package Saylee;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators2 {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//capture the error logs
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String pass = getPassword(driver);
		System.out.println(pass);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']"));
		
		
		
	driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Saylee");	

	driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(pass);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	if(pass.contains("rahulshettyacademy"))
	{
		
		driver.findElement(By.cssSelector("button.logout-btn")).click();
		driver.findElement(By.xpath("//*[text()='Forgot your password?']")).click();
		
		driver.findElement(By.cssSelector("input[placeholder*='Name']")).sendKeys("saylee");
		
		driver.findElement(By.cssSelector("input[placeholder*='Email']")).sendKeys("shitole");
			
		driver.findElement(By.cssSelector("input[placeholder*='Phone Number']")).sendKeys("1234567957");
		
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
//		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//		
//		Assert.assertEquals("* Incorrect username or password", driver.findElement(By.cssSelector("p.error")).getText());
		
	}
	

	//org.openqa.selenium.devtools.v123.console.Console.messageAdded();
	
	//Thread.sleep(2000);
	//how to handle dynamic xpaths 
	

	
	
	}
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//*[text()='Forgot your password?']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		
		String str = driver.findElement(By.cssSelector("form p")).getText();
		//this is one way
		int indexof=str.indexOf('\'');
		
		int second=str.indexOf("\'", indexof+1);
		
		String third=str.substring(indexof+1, second);
		
		//using split
		
//		String[] password = str.split("'");
//		
//		String pass=password[1].split("'")[0];

		return third;
	}
	

}
