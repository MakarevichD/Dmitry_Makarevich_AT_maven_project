package week8_homework;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TutorialCopyPaste {

    WebDriver driver;

    @Before
    public void initPreconditions() {
        driver = new ChromeDriver();
        driver.get("https://w3schools.com/java");

    }

    @Test
    public void checkSearchResults(){


        WebElement tutorText = driver.findElement(By.xpath("//h1//span[contains(.,'Tutorial')]"));
        Actions doubleClick = new Actions(driver);
        doubleClick
                .doubleClick(tutorText)
                .sendKeys(Keys.CONTROL,"c")
                .build()
                .perform();

        driver.navigate().to("https://google.com");

        WebElement searchLine = driver.findElement(By.name("q"));
        searchLine.click();

        Actions pasteKey = new Actions(driver);
        pasteKey
                .sendKeys(Keys.CONTROL, "v")
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

    }
}
