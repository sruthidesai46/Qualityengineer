import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HelloSelenium{
  public static void main(String[] args) {
    // Create a new instance of the Firefox driver
    WebDriver driver = new FirefoxDriver();
    
    // Open the browser
    driver.get("https://training-support.net");

    // Perform testing and assertions
    System.out.println(driver.getTitle());
    driver.findElement(By.linkText("About Us")).click();
    String aboutTitle = driver.getTitle();
    System.out.println("About Page Title: " + aboutTitle);
    
    

    // Close the browser
    // Feel free to comment out the line below
    // so it doesn't close too quickly
    driver.quit();
  }
}