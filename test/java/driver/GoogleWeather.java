package driver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class GoogleWeather {


    static WebDriver driver;


    public static void main(String[] args) {


        driver = new ChromeDriver();

        driver.get("https://google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.click();
        element.sendKeys("погода Минск");
        WebElement elementSearchButton = driver.findElement(By.name("btnK"));
        elementSearchButton.submit();
        WebElement elementTomorrow = driver.findElement(By.xpath("//div[@data-wob-di='1']"));
        elementTomorrow.click();

        String nextDayWeather =
                DateTimeFormatter.ofPattern("EEEE")
                        .withLocale(new Locale("ru", "BY"))
                        .format(LocalDate.now().plus(1, ChronoUnit.DAYS).getDayOfWeek());
        WebElement elementTemTomorrow = driver.findElement(By.xpath(String.format("//*[contains(@aria-label,'Celsius %s 12:00')]", nextDayWeather)));
        System.out.println(elementTemTomorrow.getAttribute("aria-label").split("°")[0]);


    }
}

