import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        List<WebElement> searchInput= driver.findElements(By.id("gsc-i-id1"));
        searchInput.get(0).click();
        searchInput.get(0).sendKeys("selenium java");
       // List<WebElement> searchBtn = driver.findElements(By.xpath("//img[@class='search-icon']"));
       // searchBtn.get(0).click();
        Thread.sleep(10000);
        driver.quit();

        //Отличия finElement от findElements
        //findElement
            // 1. возвращает первый найденный элемент
            //2. Никогда не возвращает null значения
            //Если элемент не найден, то выбрасывает Exception
        //findElements
            //1. возвращает List (список) элементов, которые подходили под локатор
            //2. Коллекция может быть null
            //3. Не выбрасывает Exception в случае ненахождения элементов
    }
}
