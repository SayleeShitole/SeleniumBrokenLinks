package Saylee;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.tagName("a")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		driver.findElement(By.xpath("//*[contains(@class,'promoCode')]")).sendKeys("rahulshettyacademy");
		
		Wait<WebDriver> fluentWait = new FluentWait<>(driver)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(2))
		        .ignoring(NoSuchElementException.class);
		
//		WebElement loginBtn = fluentWait.until(driver->{
//		    WebElement element = driver.findElement(By.id("loginButton"));
//		    return (element.isDisplayed() && element.isEnabled()) ? element : null;
//		});

		WebElement loginbtt=fluentWait.until(new Function<WebDriver,WebElement>(){
				
		public WebElement apply(WebDriver driver)
		{
			if(driver.findElement(By.id("foo")).isDisplayed())
			{
				return driver.findElement(By.id("foo"));
			}
			else
			{
				return null;
			}
			
		}
	});
		
		loginbtt.click();
			
		
	}

}
