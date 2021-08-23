package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    public static WebDriver getDriver(Config config) {

        return switch (config) {
            case CHROME -> new ChromeDriver();
            case FIREFOX, EDGE, SAFARI -> null;
            case REMOTE -> getRemoteDriver();
        };
    }

    private static WebDriver getRemoteDriver() {

        ChromeOptions options = new ChromeOptions();
        RemoteWebDriver webDriver = null;
        try {
            webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return webDriver;
    }
}
