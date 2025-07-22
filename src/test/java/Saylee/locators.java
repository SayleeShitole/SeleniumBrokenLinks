package Saylee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.beust.jcommander.internal.Console;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//capture the error logs
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
	driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Saylee");	

	driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("shitole");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	
	Assert.assertEquals("* Incorrect username or password", driver.findElement(By.cssSelector("p.error")).getText());
	
	org.openqa.selenium.devtools.v123.console.Console.messageAdded();
	
	Thread.sleep(2000);
	//how to handle dynamic xpaths 
	
	WebElement ele=driver.findElement(By.xpath("//*[text()='Forgot your password?']"));
	
	driver.findElement(By.cssSelector("input[placeholder*='Name']")).sendKeys("saylee");
	
	driver.findElement(By.cssSelector("input[placeholder*='Email']")).sendKeys("shitole");
		
	driver.findElement(By.cssSelector("input[placeholder*='Phone Number']")).sendKeys("1234567957");
	
	driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
	
	Point p=ele.getLocation();
	
	p.getX();
	
	p.getY();
	
	Point p1=new Point(100,200);
	
	driver.manage().window().setPosition(p1);
	
	driver.manage().window().getPosition();
	
	}

}
