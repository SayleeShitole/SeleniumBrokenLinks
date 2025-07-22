package Saylee;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromedriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		///WebDriverManager.chromedriver().setup();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
//		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
//		String Str=driver.getTitle();
//		
//		System.out.println(Str);
//		
//		System.out.println(driver.getCurrentUrl());
//		
//		//driver.quit();
//		
//		System.out.println(driver.getPageSource());
//		
		
		//Login page
		
		//locators 
		
		 driver.manage().window().maximize(); 
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("rahulshettyacademy");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("learning");
		
		
		
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		Thread.sleep(4000);
		 //Alert alert = driver.switchTo().alert();
		String des = driver.findElement(By.xpath("//p[contains(text(),'You will be limited')]")).getText();
		System.out.println(des);
		Thread.sleep(4000);
		
		//String text = alert.getText();
		if(des.contains("Proceed?"))
		{
		driver.findElement(By.id("okayBtn")).click();
		//alert.accept();
		}
		else
		{
			driver.findElement(By.id("cancelBtn"));
			//alert.dismiss();
		}
		
		
		driver.findElement(By.xpath("//select[@data-style='btn-info']")).click();
		
		
		List<WebElement> sel = driver.findElements(By.xpath("//select[@data-style='btn-info']/option"));
		
		
		for(WebElement drop:sel)
		{
		
			String str = drop.getText();
		
		if(str.contains("Teacher"))
		{
			drop.click();
			break;
		}
		}
		
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
		
		
		//capture error logs
		
		
		
		
		
		
		
		
		
	}

}
