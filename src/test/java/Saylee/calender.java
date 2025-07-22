package Saylee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {
	
	
	public static void unitedAirlinesstart(WebDriver driver,String expectedmonthyear,String expectedDate)
	{
		
		driver.findElement(By.xpath("//button[@type='button']//preceding::*[name()='svg']/parent::button/parent::div[@class='atm-c-datepicker__input-container']/button")).click();
		
		
		while(true)
		{
			String actualdate=driver.findElement(By.xpath("(//span[@class='rdp-caption_label'])[1]/parent::div[@class='rdp-month_caption']")).getText();
			
			if(actualdate.equals(expectedmonthyear))
			{
				break;
			}
			
			else
			{
				driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
			}
			
			List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='rdp-month']/table)[1]/parent::div//td[@class='rdp-day']/button"));
			
			for(WebElement days:dates)
			{
				String dayText=days.getText();
				
				if(dayText.equals(expectedDate))
				{
					days.click();
					break;
				}
			}
		}
	}
	
	
	public static void unitedAirlinesend(WebDriver driver,String expectedmonthyear,String expectedDate)
	{
		
		driver.findElement(By.xpath("//button[@type='button']//preceding::*[name()='svg']/parent::button/parent::div[@class='atm-c-datepicker__input-container']/button")).click();
		
		
		while(true)
		{
			String actualdate=driver.findElement(By.xpath("(//span[@class='rdp-caption_label'])[1]/parent::div[@class='rdp-month_caption']")).getText();
			
			if(actualdate.equals(expectedmonthyear))
			{
				break;
			}
			
			else
			{
				driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
			}
			
			List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='rdp-month']/table)[1]/parent::div//td[@class='rdp-day']/button"));
			
			for(WebElement days:dates)
			{
				String dayText=days.getText();
				
				if(dayText.equals(expectedDate))
				{
					days.click();
					break;
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.united.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(7000);
		unitedAirlinesstart(driver,"July 2025","9");
		
		unitedAirlinesend(driver,"August 2025","9");

	}

}
