package week8;

import driver.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNew {

    private static WebDriver webDriver;


    public static WebDriver getWebDriver(Config config) {

        return switch (config) {
            case CHROME -> new ChromeDriver();
            case SAFARI, FIREFOX, REMOTE, EDGE -> null;
        };
    }
}