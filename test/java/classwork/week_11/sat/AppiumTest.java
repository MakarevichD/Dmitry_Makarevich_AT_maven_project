package classwork.week_11.sat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {


        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "pixel 3");
        caps.setCapability("platformName","android");
        caps.setCapability("browserName","chrome");

        WebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);

        driver.get("https://onliner.by");

        Thread.sleep(5000);
        driver.quit();
    }
}
