package week8_homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateOptions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.navigate().to("https://ya.ru");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
