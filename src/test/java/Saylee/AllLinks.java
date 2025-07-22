package Saylee;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());	
		
		WebElement footerele=driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		
		System.out.println(footerele.findElements(By.tagName("a")).size());
		
		WebElement col=footerele.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(col.findElements(By.tagName("a")).size());
		
		for(int i=1;i<col.findElements(By.tagName("a")).size();i++)
		{
			String clik=Keys.chord(Keys.CONTROL,Keys.ENTER);
			col.findElements(By.tagName("a")).get(i).sendKeys(clik);
			Thread.sleep(5000);
		}
		//driver.close();
		
		String mainWindow = driver.getWindowHandle(); // Store main window

		Set<String> allWindows = driver.getWindowHandles(); // All window IDs

		for (String windowHandle : allWindows) {
		    if (!windowHandle.equals(mainWindow)) {
		        driver.switchTo().window(windowHandle); // Switch to child window
		        System.out.println("Child Window Title: " + driver.getTitle());
		       // driver.close(); // Close child window
		    }
		}
		
		Set<String> allWindow = driver.getWindowHandles();
		
		Iterator<String> it=allWindow.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			
			System.out.println(driver.getTitle());
		}
	}

}
