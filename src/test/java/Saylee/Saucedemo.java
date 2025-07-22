package Saylee;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucedemo {

	
	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		Utility util1 = new Utility();
		
		String expected_url = "https://www.saucedemo.com/inventory.html";

		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys(util1.readData(0, 0, 0));
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(util1.readData(0, 0, 1));

		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		
		String actual_url=driver.getCurrentUrl();
		
		if(actual_url.equals(expected_url))
		{
		util1.writeData(0, 0, 2, "Pass");
		}
		else
		{
		util1.writeData(0, 0, 2, "Fail");
		}
	}

	
}
