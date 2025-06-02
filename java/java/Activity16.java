import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class Activity16 {
    public static void main(String[] args) {
        // Initialize Firefox driver
        WebDriver driver = new FirefoxDriver();

        
            // Open the alerts page
            driver.get("https://training-support.net/webelements/alerts");

            // Get and print page title
            System.out.println("Page title is: " + driver.getTitle());

            // Find and click the button to open a simple alert
            WebElement simpleAlertButton = driver.findElement(By.id("simple"));
            simpleAlertButton.click();

            // Switch to alert and get text
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert text: " + alert.getText());

            // Accept the alert (click OK)
            alert.accept();
        
            // Close the browser
            driver.quit();
        
    }
}
