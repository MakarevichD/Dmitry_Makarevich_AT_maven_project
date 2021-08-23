package week8_homework;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BookingToParis {

    WebDriver driver;

    @Before
    public void initPreconditions() {

        driver = new ChromeDriver();
        driver.get("https://booking.com");

    }

    @Test
    public void checkInForWeek() {

        WebElement searchLocation = driver.findElement(By.name("ss"));
        searchLocation.sendKeys("Париж");
        WebElement dateCheck = driver.findElement(By.className("bk-icon -experiments-calendar sb-date-picker_icon-svg"));
        dateCheck.click();


    }
}
