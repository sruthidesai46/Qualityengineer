import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class Activity18 {
    public static void main(String[] args) {
        // Set up the WebDriver
        WebDriver driver = new FirefoxDriver();

        try {
            // Open the target URL
            driver.get("https://training-support.net/webelements/alerts");

            // Print the title of the page
            System.out.println("Page title is: " + driver.getTitle());

            // Find and click the PROMPT alert button
         // Locate the prompt alert button using its unique identifier or text
            WebElement promptButton = driver.findElement(By.id("prompt")); // Replace 'prompt' with the actual id if different
            promptButton.click();


            // Switch to alert
            Alert promptAlert = driver.switchTo().alert();

            // Get and print the text in the prompt
            System.out.println("Prompt text: " + promptAlert.getText());

            // Enter text into the prompt
            promptAlert.sendKeys("Awesome!");

            // Accept the alert
            promptAlert.accept();

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
