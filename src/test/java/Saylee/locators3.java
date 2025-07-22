package Saylee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators3 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();

			System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

			driver.get("https://rahulshettyacademy.com/AutomationPractice/");

			System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

			System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());


			driver.manage().window().maximize();

			driver.navigate().to("https://rahulshettyacademy.com");

			driver.navigate().back();

			driver.navigate().forward();

			driver.navigate().refresh();
			
			driver.manage().window().fullscreen();




			}


	
}
