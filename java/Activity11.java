import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11{
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/tables");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Print the number of columns
        List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println("Number of columns: " + cols.size());
        // Print the number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());

        // Print the cells values of the third row
       /* List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
        for(WebElement cell : thirdRow) {
            System.out.println(cell.getText());
        }*/
     // Find all cells in the third row
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));

        System.out.println("Third row cell values: ");
        for(int i = 0; i < thirdRow.size(); i++) {
            WebElement cell = thirdRow.get(i);
            System.out.println(cell.getText());
        }


        // Print the cell value of the second row and second column
        WebElement cellValue = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + cellValue.getText());

        // Close the browser
        driver.quit();
    }
}