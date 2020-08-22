import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverAPICore {

    public void example() {
        //интерфейс веб драйвера для создания объекта браузера в рамках ЯП
        //ChromeDriver - конкретная реализация веб райвера, т.к. веб драйвер всего лишь интерфейс
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //Класс By используется для интерпретации уникальных идентификаторов элементов
        By searchSelector = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");
        //Веб элемент - этотоже интерфейс
        WebElement searchButton = driver.findElement(searchSelector);
        searchButton.click();

        driver.quit();


    }
}
