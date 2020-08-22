import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helloworld {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        WebElement searchInput= driver.findElement(By.id("gsc-i-id1"));
        searchInput.click();
        searchInput.sendKeys("selenium java");
        WebElement searchBtn = driver.findElement(By.xpath("//img[@class='search-icon']"));
        searchBtn.click();
        Thread.sleep(10000);
        driver.quit();


    }
}
