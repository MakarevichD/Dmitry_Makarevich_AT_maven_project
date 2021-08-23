package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class SeleniumTest {

    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {

        //System.setProperty("webdriver.chrome.driver", "D:\chromedriver.exe");
        //driver = new RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions());
        driver = new ChromeDriver();

        driver.get("https:/selenium.dev");

        driver.get("https://onliner.by");
        WebElement el = driver.findElement(By.className("onliner_logo"));
        el.click();
        driver.close();
    }
}
