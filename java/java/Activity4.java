import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {

        // Start Firefox browser
        WebDriver driver = new FirefoxDriver();

        // Open target URL
        driver.get("https://training-support.net/webelements/dynamic-controls");

        // Print page title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        try {
            // Locate checkbox using XPath
            WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

            // Check if it's selected before clicking
            System.out.println("Checkbox selected before click: " + checkbox.isSelected());

            // Click the checkbox
            checkbox.click();

            // Check if it's selected after clicking
            System.out.println("Checkbox selected after click: " + checkbox.isSelected());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
