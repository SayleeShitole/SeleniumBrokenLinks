package Saylee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns {
	
	public static String getvalue() {
		String str= "Saylee Saylee Shitole Shitole";
		String[] words = str.split(" ");
		StringBuilder sb=new StringBuilder();
		HashMap<String, Integer> li=new HashMap<>();
		for(String str11:words)
		{
			li.put(str11, li.getOrDefault(str11, 0)+1);
			
		}
		
		
		for(Map.Entry<String, Integer> entry:li.entrySet())
		{
			sb.append(entry.getKey()).append(entry.getValue());
		}

		return sb.toString();
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement dropdown = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		
		Select select=new Select(dropdown);
		
		select.selectByValue("USD");
		
		select.selectByIndex(1);
		
		select.selectByVisibleText("AED");
		
		driver.navigate().to("https://www.spicejet.com/");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
		
		String adult = driver.findElement(By.xpath("//*[@class='css-76zvg2 r-homxoj r-1i10wst r-1kfrs79' and contains(text(),'Adult')]")).getText();
		
		driver.findElement(By.xpath("//*[@class='css-76zvg2 r-homxoj r-1i10wst r-1kfrs79' and contains(text(),'Children')]")).getDomAttribute("style");
		String children=driver.findElement(By.xpath("//*[@class='css-76zvg2 r-homxoj r-1i10wst r-1kfrs79' and contains(text(),'Children')]")).getText();
		
		String Infant=driver.findElement(By.xpath("//*[@class='css-76zvg2 r-homxoj r-1i10wst r-1kfrs79' and contains(text(),'Infant')]")).getText();
		
		String[] str= {"adult","adult","Child","Infant"};
		StringBuilder sb=new StringBuilder();
		HashMap<String, Integer> li=new HashMap<>();
		
		for(String str11:str)
		{
			Integer list = li.put(str11, li.getOrDefault(str11, 0)+1);
			
		}
		
		
		for(Map.Entry<String, Integer> entry:li.entrySet())
		{
			sb.append(entry.getValue());
		}
		String str11 = sb.toString();

		if(adult.equals("Adult"))
		{

			for(int i=0;i<=3;i++)
			{
				driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']//*[name()='svg']")).click();;
			}
		}

		 if(children.equals("Children"))
		{
			for(int i=0;i<=1;i++)
			{
				driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']//*[name()='svg']")).click();
			}
		}
	
	 if(Infant.equals("Infant"))
		{
			for(int i=0;i<=1;i++)
			{
				driver.findElement(By.xpath("//div[@data-testid='Infant-testID-plus-one-cta']//*[name()='svg']")).click();;
			}
		}
		
		
	 
	 //This is ref code for just to check the webelement is enabled or not
	 
	 
	 System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

	 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

	 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

	 {


	 System.out.println("its enabled");

	 Assert.assertTrue(true);

	 }

	 else

	 {

	 Assert.assertTrue(false);

	 }

	 
	 //end to end code
	 
	// System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

	 //WebDriver driver =new ChromeDriver();

//	 driver.get("http://spicejet.com"); //URL in the browser
//
//	 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
//
//	 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//
//	 driver.findElement(By.xpath("//a[@value='DEL']")).click();
//
//	 Thread.sleep(2000);
//
//
//	 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//
//	 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//
//
//	 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
//
//	 {
//
//
//	 System.out.println("its disabled");
//
//	 Assert.assertTrue(true);
//
//
//	 }
//
//	 else
//
//	 {
//
//	 Assert.assertTrue(false);
//
//	 }
//
//	 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//
//
//	 driver.findElement(By.id("divpaxinfo")).click();
//
//	    Thread.sleep(2000L);
//
//	 for(int i=1;i<5;i++)
//
//	 {
//
//	 driver.findElement(By.id("hrefIncAdt")).click();
//
//	 }
//
//
//	 driver.findElement(By.id("btnclosepaxoption")).click();
//
//	 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//
//	 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//
//
//
//	 // driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
//
//	 driver.findElement(By.cssSelector("input[value='Search']")).click();
//
//	 // driver.findElement(By.xpath("//input[@value='Search']")).click();
//
//	 // driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
}

}
