package Saylee;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/form");

        WebElement passwordField = driver.findElement(By.id("password"));

        // Locate the username input field above the password field
        WebElement usernameField = driver.findElement(with(By.tagName("input")).above(passwordField));
        usernameField.sendKeys("testuser");

        // Locate the login button below the password field
        WebElement loginButton = driver.findElement(with(By.tagName("button")).below(passwordField));
        loginButton.click();

        // Locate a label or checkbox to the left of another element
        WebElement checkbox = driver.findElement(By.id("rememberMe"));
        WebElement label = driver.findElement(with(By.tagName("label")).toLeftOf(checkbox));
        System.out.println("Label text: " + label.getText());

        driver.quit();
    }
}
